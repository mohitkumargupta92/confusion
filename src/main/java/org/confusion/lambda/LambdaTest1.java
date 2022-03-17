package org.confusion.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaTest1 {

    public static void main(String[] args) {
        System.out.println(createPerson()
                .parallelStream()
                .filter(p -> p.getAge() > 11)
                .filter(p -> p.getGender() == Gender.FEMALE)
                .map(p -> p.getName())
                .findFirst()
                .orElse("No One")
        );
    }

    public static List<Person> createPerson() {
        return Arrays.asList(
                new Person("A", 1, Gender.MALE),
                new Person("A", 110, Gender.MALE),
                new Person("B", 111, Gender.MALE),
                new Person("C", 112, Gender.MALE),
                new Person("D", 113, Gender.MALE),
                new Person("E", 114, Gender.MALE),
                new Person("F", 115, Gender.MALE),
                new Person("G", 116, Gender.MALE),
                new Person("H", 117, Gender.FEMALE),
                new Person("I", 118, Gender.MALE),
                new Person("J", 119, Gender.FEMALE),
                new Person("K", 1111, Gender.FEMALE),
                new Person("L", 1112, Gender.FEMALE),
                new Person("M", 1113, Gender.FEMALE),
                new Person("N", 1114, Gender.FEMALE),
                new Person("O", 1115, Gender.FEMALE),
                new Person("P", 1116, Gender.FEMALE),
                new Person("Q", 1117, Gender.FEMALE),
                new Person("R", 1118, Gender.FEMALE),
                new Person("S", 1119, Gender.FEMALE)
        );
    }
}
