package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); //b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        //프로그래밍에서 사이드 이펙트는 보통 부정적, b만 부산으로 바꾸려고했는데
        //a도 부산으로 바뀌어버림(사이드 이펙트)
        System.out.println("b = " + b);
    }
}
