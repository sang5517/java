package day8;

import day5.Person;

public class Excetption2 {
    public static void main(String[] args) {
        Person p1 = null;

        p1.hi();
    }
}
class Person2 {
    public void hi() {
        System.out.println("안녕");
    }
}