package pack.classOfBoysAndGirls;

public abstract class Clothes {
    private ClothesName ClothName;
    private ClothesColour ClothColour;
    private Integer ClothPocketsCount;
    private Integer ClothSize;


    public void setClothSize(Integer clothSize) {
        ClothSize = clothSize;
    }

    public void setClothColour(ClothesColour clothColour) {
        ClothColour = clothColour;
    }

    public void setClothName(ClothesName clothName) {
        ClothName = clothName;
    }

    public void setClothPocketsCount(Integer clothPocketsCount) {
        ClothPocketsCount = clothPocketsCount;
    }

    public Integer getClothSize() {
        return ClothSize;
    }

    public ClothesColour getClothColour() {
        return ClothColour;
    }

    public ClothesName getClothName() {
        return ClothName;
    }

    public Integer getClothPocketsCount() {
        return ClothPocketsCount;
    }
    public void setRandomClothPockets()
    {
        int randNum;
        randNum = (int)(Math.random() * 5 ) ;
        setClothPocketsCount(randNum);
    }
    public void setRandomClothSize()
    {
        int randNum;
        randNum = (int)(Math.random() * 10 + 10 );
        setClothSize(randNum);
    }

    public void setRandomClothName()
    {

        int randNum;
        randNum = (int)(Math.random() * 4 + 1 ) ;
        switch (randNum)
        {
            case 1:
            {
                setClothName(ClothesName.JACKET);
                break;
            }
            case 2:
            {
                setClothName(ClothesName.SHIRT);
                break;
            }
            case 3:
            {
                setClothName(ClothesName.COAT);
                break;
            }
            case 4:
            {
                setClothName(ClothesName.WAISTCOAT);
                break;
            }
        }
    }
    public void setRandomClothColour()
    {
        int randNum;
        randNum = (int)(Math.random() * 4 + 1 ) ;
        switch (randNum)
        {
            case 1:
            {
                setClothColour(ClothesColour.BLACK);
                break;
            }
            case 2:
            {
                setClothColour(ClothesColour.BROWN);
                break;
            }
            case 3:
            {
                setClothColour(ClothesColour.RED);
                break;
            }
            case 4:
            {
                setClothColour(ClothesColour.GREEN);
                break;
            }
        }
    }
}
