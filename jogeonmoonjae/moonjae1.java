package jogeonmoonjae;
// 두수 num1과 num2가 주어집니다.
// 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.

public class moonjae1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int result1 = 0;
        int result2 = 0;
        // 조건이기때문에 if를써줘야함

        if(num1 >= num2) {
            result1 = num1 - num2;
        }
        if(num1 < num2) {
            result1 = num2 - num1;
        }
        System.out.println(result1);

        if(num1 < num2) {
            result2 = num2 - num1;
        } else if (num1 >= num2) {
            result2 = num1 - num2;
        }






    }

}
