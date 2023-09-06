package day6.overlodeong;

public class contructoroverload2 {

        public static void main(String[] args) {
            Person1 p1 = new Person1(20, "홍길동");
            p1.introduce();

            Person1 p2 = new Person1();

            p2.age = 30;
            p2.name = "이순신";

            Person1 p3 = new Person1(30);

            p3.name = "유관순";


        }
    }

    class Person1 {
        int age;
        String name;

        Person1() {

        }

        Person1(int age) {
            this.age = age;
        }

        Person1(int age, String name) {
            this.age = age;
            this.name = name;
        }

        void introduce() {
            System.out.printf("%d살 %s입니다.\n", this.age, this.name);
        }
    }
