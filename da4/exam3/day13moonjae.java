package da4.exam3;

import java.text.CharacterIterator;

public class day13moonjae
{
    public static void main(String[] args) {

        Carj carruns = new Carj();
        Carj carrunv = new Carj();


         // 자동차가 최대속력 km로 달립니다
        carruns.speed = 220;
        carrunv.speed = 250;
        carruns.carruni();
        carrunv.carruni();

    }

}

class Carj {
    int speed;
    public void carruni() {
        System.out.printf("자동차가 최대속력 %dkm로 달립니다.\n",speed);
    }
}
// 출력 : 자동차가 최대속력 220km로 달립니다.
// 출력 : 자동차가 최대속력 250km로 달립니다.



//문제3. 출력: 자동차가 최대속력 300km로 달립니다.







