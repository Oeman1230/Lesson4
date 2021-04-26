package pack;

import pack.classOfBoysAndGirls.ClassOfPeople;
import pack.classOfBoysAndGirls.Clothes;
import pack.classOfBoysAndGirls.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ClassOfPeople classOfPeople = new ClassOfPeople();
        classOfPeople.CreateClassOfPeopleByCountAndQuantity(40, 30, 70);
        System.out.println("boys:" + classOfPeople.getBoysCount() + " girls:" + classOfPeople.getGirlsCount());

        Comparator<Person> comClothName = Comparator.comparing(Clothes::getClothName);

        Stream<Person> clothesUp = classOfPeople.getPeople().stream().sorted(comClothName);

       List<Person> lis = clothesUp.collect(Collectors.toList());
       lis.forEach(it ->  System.out.println(it.getPersonName() + " "+it.getPersonGender() + " " + it.getClothName()));

    }
}
