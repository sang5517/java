package liga;

public class moonjae {
    public static void main(String[] args) {


        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        // 같은 거에서 다른점을 찾는다.
        // 달라지는 곳에 규칙이 있는지 확인
        // step1
        System.out.println("2 X 1 = 2");
        System.out.println("2 X 2 = 4");
        System.out.println("2 X 3 = 6");
        System.out.println("2 X 4 = 8");


        for (int i = 1; i < 10; i++) {


        }

        //step2
        // 2단~ 9단


        // step 3
        // 짝수단,홀수단,짝수곱,홀수곱 등을 표현할 수있따.
        // 짝수곱만 출력
        for (int j = n; j < m; j++) { // 단
            if (j % 2 != 0) {
                for (int i = 1; i <= limit; i++) { // 곱
                    if (i % 2 == 0) {
                        System.out.println(i + " X " + i + " = " + i * j);
                    }
                }




    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190


    */


            }
        }
    }
    }