package da4.exam3;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;

public class day14moonj {
    public static void main(String[] args) {

        Carg carrung = new Carg();
        carrung.speed2 = 300;

        carrung.carrungh();


        //문제3. 출력: 자동차가 최대속력 300km로 달립니다.

    }
}
class Carg {
    int speed2;
    public void carrungh() {
        System.out.printf("자동차가 최대속력 %dkm로 달립니다.\n",speed2);
    }
}


