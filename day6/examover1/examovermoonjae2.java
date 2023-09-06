package day6.examover1;

class 계산기 {


    String 더하기;

    public int 더하기(int age, int age2) {
        return age + age2;
    }
    public int 더하기(int age, int age2, int age3) {
        return age + age2 + age3;
    }
    public double 더하기(double age, int age2, int age3) {
        return age + age2 + age3;
    }
}






public class examovermoonjae2 {
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10, 20));
        // 출력 : 30

        System.out.println(a계산기.더하기(10, 20, 30));
        // 출력 : 60

        System.out.println(a계산기.더하기(10.5, 20, 30));
        // 출력 : 60.5
    }

}

