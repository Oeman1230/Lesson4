package pack;

import pack.classOfBoysAndGirls.ClassOfPeople;
import pack.classOfBoysAndGirls.Clothes;
import pack.classOfBoysAndGirls.ClothesColour;
import pack.classOfBoysAndGirls.Person;

import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ClassOfPeople classOfPeople = new ClassOfPeople();
        classOfPeople.CreateClassOfPeopleByCountAndQuantity(40, 30, 70);
        System.out.println("boys:" + classOfPeople.getBoysCount() +
                " girls:" + classOfPeople.getGirlsCount());
        System.out.println("==============================================");
        Double averageAge = 0.0;
        for (int i = 0; i < classOfPeople.getPeople().size() - 1; i++) {
            averageAge += classOfPeople.getPeople().get(i).getPersonAge();
        }

        System.out.println("average age " + averageAge / classOfPeople.getPeople().size());
        System.out.println("==============================================");

        Comparator<Person> comClothName = Comparator.comparing(Clothes::getClothName);

        Stream<Person> clothesUp = classOfPeople.getPeople().stream().sorted(comClothName);

        List<Person> listClothName = clothesUp.collect(Collectors.toList());
        listClothName.forEach(it -> System.out.println(it.getPersonName() +
                " " + it.getPersonGender() + " " + it.getClothName()));
        System.out.println("==============================================");
        Comparator<Person> comClothSize = Comparator.comparing(Clothes::getClothSize);

        Stream<Person> clothesSize = classOfPeople.getPeople()
                .stream().sorted(comClothSize.reversed());
        List<Person> listClothSize = clothesSize.collect(Collectors.toList());
        listClothSize.forEach(it -> System.out.println(it.getPersonName() +
                " " + it.getPersonGender() + " " + it.getClothSize()));
        System.out.println("==============================================");
        Stream<Person> pocketCountSt = classOfPeople.getPeople()
                .stream().filter(it -> it.getClothPocketsCount() == 2);
        List<Person> listPockets = pocketCountSt.collect(Collectors.toList());
        listPockets.forEach(it -> System.out.println(it.getPersonName() +
                " " + it.getPersonGender() + " " + it.getClothPocketsCount()));
        System.out.println("==============================================");
        Stream<Person> colourSt = classOfPeople.getPeople().stream()
                .filter(it -> it.getClothColour() == ClothesColour.BROWN | it.getClothColour() == ClothesColour.GREEN)
                .sorted(Comparator.comparing(Clothes::getClothColour));
        List<Person> listColour = colourSt.collect(Collectors.toList());
        listColour.forEach(it -> System.out.println(it.getPersonName()
                + " " + it.getPersonGender() + " " + it.getClothColour()
        ));
        System.out.println("==============================================");
        classOfPeople.getPeople().forEach(it -> System.out.println(
                it.getPersonName() + " " +
                it.getPersonGender() + " " +
                        it.getPersonAge() + " " +
                        it.getClothName() + " " +
                        it.getClothColour() + " " +
                        it.getClothSize() + " " +
                        it.getClothPocketsCount()
        ));
    }
}

