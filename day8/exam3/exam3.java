package day8.exam3;
import java.util. ArrayList;

import static liga.hamsoo3.introduce;

public class exam3 {
    public static void main(String[] args) {

        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        // 2. 네 사람에게 자기소개 시키기
        // 3. 30대인 사람에게만 자기소개 시키기

        ArrayList<사람> C저장소 = new ArrayList<>();
        C저장소.add(사람1);
        C저장소.add(사람2);
        C저장소.add(사람3);
        C저장소.add(사람4);


        for(사람 사람 : C저장소) {
          사람.introduce();
        }

        //30대인 사람만 자기소개 시키키
        //for문을 사용하여 반복시켜야하기때문에
        for(사람 사람 : C저장소) {
            if(사람.getAge() >= 30 && 사람.getAge() < 40) {
            사람.introduce();
            }
        }
    }

 }


class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}





