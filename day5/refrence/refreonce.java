package day5.refrence;

public class refreonce {
    public static void main(String[] args) {

        // 설명
        // 메인 함수가 시작되면 a자동차라는 변수가 스택 영역에 만들어진다.
        // a자동차 변수는 자동차 타입이기 때문에 자동차 리모컨만 들어올 수 있다.
        // 현재는 아무것도 넣지 않았기 때문에 비어있다고 볼 수 있다.
        자동차 a자동차;

        // 설명
        // new 자동차()를 하면 힙에 자동차 클래스를 본 딴 객체가 힙에 만들어진다.
        // 그와 동시에 객체를 조종할 수 있는(연결되어 있는) 리모컨도 함께 만들어진다.
        // 리모컨은 스택에 저장할 수 있기 때문에 a자동차 변수에 저장한다.
        a자동차 = new 자동차();

        // 설명
        // a자동차에 있는 리모컨을 이용해서 연결된 자동차에 명령을 내린다.
        // 연결된 객체(자동차)가 작동한다.
        a자동차.달리다();
    }
}
class 자동차 {
    // 달리다 함수/메서드
    void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}

