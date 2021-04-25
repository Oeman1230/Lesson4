package pack;

import pack.classOfBoysAndGirls.ClassOfPeople;

public class Main {

    public static void main(String[] args) {
        ClassOfPeople classOfPeople = new ClassOfPeople();
        classOfPeople.CreateClassOfPeopleByCountAndQuantity(40, 30, 70);
        System.out.println("boys:" + classOfPeople.getBoysCount() + " girls:" + classOfPeople.getGirlsCount());
    }
}
