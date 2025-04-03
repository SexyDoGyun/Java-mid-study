package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        //프로그래밍에서 사이드 이펙트는 보통 부정적, b만 부산으로 바꾸려고했는데
        //a도 부산으로 바뀌어버림(사이드 이펙트)
        System.out.println("b = " + b);
    }
}
