package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = new Address("서울");
//        Address b = a; //참조값 대입을 막을 수 있는 방법이 없다.
        //RefMain1_1에서는 a와 b가 같은 인스턴스를 참조해 b를 변경하면 사이드 이펙트 발생
        //사이드 이펙트 방지를 위해서 b도 인스턴스를 생성해준다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); //b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b); //b의 값을 변경해도 다른 인스턴스를 참조하므로 사이드이펙트 발생x
    }
}
