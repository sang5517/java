package day7.modifermoonjae2;
// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
public class ance2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setid(20);


        // 구현시작
        // 구현끝

        // 출력 : 제 번호는 20 입니다.
    }
}

class Person {

    private int id;
    public void setid(int num) {
        this.id = num;
    }
    public int getid() {
        return this.id;
    }



    // 힌트 : 여기에 메소드 2개 추가해야 합니다.



}


