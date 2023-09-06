package day6.overlodeong;

public class contructoroverload {

    public static void main(String[] args) {

        Person p1 = new Person(20, "홍길동");


        p1.introduce();


        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person(30);
    }
}

class Person {
    int age;
    String name;
    Person() {

    }
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Person(int age) {
        this.age = age;
    }


    void introduce() {
        System.out.printf("%살");
    }
}