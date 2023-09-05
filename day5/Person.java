package day5;

public class Person {

    int age;
    String name;


    public  void introduce() {
        System.out.println("안녕");
    }


    public static class referrence {
        public static void test(String param) {
            System.out.println();
        }
            public static void main(String[]args) {
                int num = 10;
                String str = "hello";
                double d = 3.14;

               // Person p1;  무슨의미?

                Person p1; // 무슨 의미? 사람이 한명 있다.(x)
                // p1은 null이다.= 값이 없다고 보면됨.




                p1 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p1에 저장
                Person p2 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p2에 저장


                p1.age = 20;
                p1.name = "홍길동";

                p2.age = 30;
                p2.name = "이순신";

                p1.introduce();
                p2.introduce();


                // num1, num2는 원본이고, p1,p2는 참조(reference)다
                int num1 = 10;
                int num2 = num1;



                num2 = 20; // num2에 20대입, 그렇다고 num1이 20으로 바뀌진 않는다.

                p1 = p2; // p1이 p2를 가리킨다.

                p1.name = "임꺽정";

                System.out.println(p1.name);
                System.out.println(p2.name);
                System.out.println(num);


            }


    }
}
