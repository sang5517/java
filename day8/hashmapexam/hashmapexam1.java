package day8.hashmapexam;

import day8.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class hashmapexam1 {

    public static void main(String[] args) {
        // 사람 정보를 map으로 저장하고 출력하기
        // 사람 1 정보
        // 이름 : 홍길동
        // 나이 : 22
        // 키 : 170.5

        //import 단축기 -> alt + enter

        // 사람 2 정보
        // 이름 : 홍길순
        // 나이 : 25
        // 키 : 162.4

       HashMap<String, Object> 사람1 = new HashMap<>();
        사람1.put("이름", "홍길동");
        사람1.put("나이", 22);
        사람1.put("키", 170.5);



        System.out.println(사람1);
        System.out.println(사람1);


        HashMap<String, Object> 사람2 = new HashMap<>();
        사람1.put("이름", "홍길순");
        사람1.put("나이", 25);
        사람1.put("키", 162.4);


        System.out.println("이름 : %");






    }
}

