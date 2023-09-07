package day7.datertypemoonjae2;
// 내용 : 각각의 기본형 타입은 하나의 래퍼클래스를 가지고 있습니다. 래퍼클래스를 통해서 기본형 변수에 대한 자세한 정보를 알 수 있습니다.
// 문제 : 모든 기본형 타입에 대해서 래퍼클래스를 사용하여 최대값 최소값을 출력해보세요.
public class adkfjakfa1 {
    public static void main(String[] args) {
        byte b;
        System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
        System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);

        char c;
        System.out.println("char의 최소값 : " + Character.MIN_VALUE);
        System.out.println("char의 최대값 : " + Character.MAX_VALUE);

        short s;

        int i;
        System.out.println("int의 최소값 : " + Integer.MIN_VALUE);
        System.out.println("int의 최대값 : " + Integer.MAX_VALUE);

        long l;

        float f;

        double d;

        boolean bl; // 1 bit
    }
}
