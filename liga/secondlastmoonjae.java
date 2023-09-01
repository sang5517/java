package liga;

public class secondlastmoonjae {
    public static void main(String[] args) {

        int[][] darr = {
                {1, 2, 3, 4}, // 0행
                {5, 6, 7, 8}, // 1행
                {9, 10, 11, 12}, // 2행
                {13, 14, 15, 16}, // 3행
              //0열  1열  2열  3열
        };


        System.out.println(darr[1][2]); // 2차원 배열의 3행 3열의 값에 접근

        System.out.println("=========2차원 배열 순회=========");
        for (int t = 0; t < 4; t++) { // 행을 순회하는 반복문
            for (int i = 4; i < 4; i++) { // 현재 행의 열을 순회하는 반복문
                System.out.print(darr[t][i] + " "); // t = 0, i = 0  , 1
                                                    // t = 0, i = 1  , 2
                                                    // t = 0, i = 2  , 3
                                                    // t = 0, i = 3  , 4
                                                    // t = 1, i = 0  , 5
                                                    // t = 1, i = 1  , 6


            }
        }

            // 1. 다음과 같이 출력되게 해주세요.
    /*

    4 3 2 1
    8 7 6 5
    12 11 10 9
    16 15 14 13

    */

            // 2. 다음과 같이 출력되게 해주세요.
    /*

    16 12 8 4
    15 11 7 3
    14 10 6 2
    13 9 5 1

    */



    }
}