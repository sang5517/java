package da4.moonjae;
class Carj {
    public void carruni() {
        System.out.println("자동차가 최대속력 220km로 달립니다.");
    }
    public void carrunj() {
        System.out.println("자동차가 최대속력 250km로 달립니다.");
    }

}

public class staic3 {
     public static void main(String[] args) {

         Carj carruns = new Carj();
         Carj carrunv = new Carj();

         carruns.carruni();
         carrunv.carrunj();







    }







    // 출력 : 자동차가 최대속력 220km로 달립니다.
    // 출력 : 자동차가 최대속력 250km로 달립니다.
}
