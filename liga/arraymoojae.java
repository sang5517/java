package liga;

public class arraymoojae {

    public static void main(String[] args) {

        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        //int[] arr4 = {1,2,3,4,5,6,7,8,9,10};

        //      arr4[0] = 10;
        //     arr4[1] = 20;
        //    arr4[3] = 40;
        //    arr4[4] = 50;
        //   arr4[5] = 60;
        //   arr4[6] = 70;
        //  arr4[7] = 80;
        //  arr4[8] = 90;
        //  arr4[9] = 100;


        //  System.out.println(arr4[0]);
        //  System.out.println(arr4[1]);
        //  System.out.println(arr4[2]);
        //  System.out.println(arr4[3]);
        //  System.out.println(arr4[4]);
        //  System.out.println(arr4[5]);
        //  System.out.println(arr4[6]);
        //  System.out.println(arr4[7]);
        //  System.out.println(arr4[8]);
        //  System.out.println(arr4[9]);


        // 배열을 두번 출력해주세요.
 //       int[] arr = {1, 2, 3, 4, 5};

//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;


//       for (int j = 0; j < 2; j++) {
//            for (int i = 0; i < 5; i++) {
//                System.out.println(arr[i]);
//            }
//        }


        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.

        int[] arr6 = new int[]{1,2,3,4,5};
        int[] arr4 = new int[5]; // {0,0,0,0,0}

        for(int i = arr6.length -1, j = 0; i >= 0; j++, i--) {
            arr4[j] = arr6[i];
            System.out.print(arr4[j]+" ");
        }

        System.out.println("\n==========================");



        for(int i=4; i > -1; i--) {
            System.out.println(arr6[i]);
        }

        // 4
        // 3
        // 2
        // 1
        // 0
    }
}