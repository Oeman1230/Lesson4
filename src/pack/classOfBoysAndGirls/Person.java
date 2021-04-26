package pack.classOfBoysAndGirls;

public class Person extends Clothes {
    private String personName;

    private Integer PersonAge;
    private PersonGender personGender;

    public Person(Integer personNumber)
    {
        setRandomClothName();
        setRandomClothColour();
        setRandomClothPockets();
        setRandomClothSize();
        setRandomAge();
        setPersonName("Person" + personNumber);
    }
    public void setRandomAge()
    {
        PersonAge = (int)(Math.random() * 2 + 10) ;
    }
    public void makeGirl()
    {
        setPersonGender(PersonGender.GIRL);
    }
    public void makeBoy()
    {
        setPersonGender(PersonGender.BOY);
    }

    public void setPersonGender(PersonGender personGender) {
        this.personGender = personGender;
    }

    public PersonGender getPersonGender() {
        return personGender;
    }

    public void setRandomPersonGender()
    {
        int randNum;
        randNum = (int)(Math.random() * 2) ;
        switch (randNum)
        {
            case 1:
            {
                setPersonGender(PersonGender.BOY);
                break;
            }
            case 2:
            {
                setPersonGender(PersonGender.GIRL);
                break;
            }
        }
    }
    public void setPersonAge(Integer personAge) {
        PersonAge = personAge;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public Integer getPersonAge() {
        return PersonAge;
    }
}
