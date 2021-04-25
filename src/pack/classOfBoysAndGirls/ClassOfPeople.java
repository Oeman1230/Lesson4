package pack.classOfBoysAndGirls;

import java.util.ArrayList;
import java.util.List;

public class ClassOfPeople {

    private List<Person> people;
    Integer BoysCount;
    Integer GirlsCount;
    public ClassOfPeople()
    {
        people = new ArrayList<>();
    }
    public void CreateClassOfPeopleByCountAndQuantity(Integer peopleCount, Integer BoysQuantity, Integer GirlsQuantity)
    {
        BoysCount = (Integer)(peopleCount * BoysQuantity / 100 );
        GirlsCount = (Integer)(peopleCount * GirlsQuantity / 100);
        Integer i;
        for(i=0; i < BoysCount; i++)
        {
            Person kid = new Person(i);
            kid.makeBoy();
            people.add(kid);
        }
        for(i=0; i < GirlsCount; i++)
        {
            Person kid = new Person(i);
            kid.makeGirl();
            people.add(kid);
        }

    }

    public Integer getBoysCount() {
        return BoysCount;
    }

    public Integer getGirlsCount() {
        return GirlsCount;
    }
}
