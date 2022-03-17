package org.confusion.lambda;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {

    private String name;
    private int age;
    private Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("From Person Class, Name: " + this.name + " Age: " + this.age + " " + Thread.currentThread().getName());
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
