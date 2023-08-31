package liga;

public class sasasatwo {
    public static void main(String[] args) {


        // 조건문

        //실행이 될수도 있고 안될수도 있는

        System.out.println("창문 닫기");

        // 비가 올때만 창문을 닫기 ->
        boolean isRain = false;


        if (isRain) {
            System.out.println("창문 닫기2");
        }

        // 야식
        int bill = 0;
        boolean over20000 = bill >= 20000;
        // 소지금이 20000원 이상일때
        if (bill >= 20000) {
            System.out.println("치킨");
        }


        // 소지금이 20000원 미만일 때, 2000원 이상일 때
        // 논리 연산자 사용 x
        //할인대상 - > 19세 이하, 60세 이상가 할인 대상}
        if (bill < 20000) {
            if (bill >= 2000) {
                System.out.println("포카칩");
            }

            // 할인대상 -> 19세 이하, 60세 이상 할인 대상

            int age = 11;
            if (age <= 19) {
                System.out.println("할인대상");
            }
            if (age >= 60) {
                System.out.println("할인대상");
            }
            // 논리 연산자를 사용한 버전
            if (age <= 19 || age >= 60) {
                System.out.println("할인대상||");
            }

        }

    }}