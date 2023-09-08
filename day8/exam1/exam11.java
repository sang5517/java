package day8.exam1;

// {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
// ArrayList의 사이즈를 출력해주세요.
// ArrayList의 3,4번째 값을 읽어서 출력해주세요.
// 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
// List의 모든 값을 출력해주세요.

import java.util.ArrayList;

public class exam11 {

    public static void main(String[] args) {

        // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
        // 리스트에 값을 추가해주세요.

        ArrayList<Integer> B저장소 = new ArrayList<>();

        B저장소.add(5);
        B저장소.add(4);
        B저장소.add(3);
        B저장소.add(2);
        B저장소.add(1);
        B저장소.add(0);




        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        // 출력결과 : 6
        int size = B저장소.size();
        System.out.println(size);


        // get()
        // 리스트의 3,4번째 값을 출력해주세요.
        // 출력결과 : 3, 2
        int num = B저장소.get(2);
        System.out.println(num);
        int num1 = B저장소.get(3);
        System.out.println(num1);




        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 1, 0

        B저장소.remove(0);
        B저장소.remove(0);

        int num2 = B저장소.get(2);
        System.out.println(num2);
        int num3 = B저장소.get(3);
        System.out.println(num3);

        // 반복문으로 출력.
        //
        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 3, 2, 1, 0
        for(int i = 0; i < B저장소.size(); i++) {
            int value = B저장소.get(i);
            System.out.println(value);
        }



    }
}

