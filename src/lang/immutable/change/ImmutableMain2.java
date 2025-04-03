package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

//        ImmutableObj.add() 메서드에서 return 값을 사용하지 않아서 값 변경 x
        System.out.println("obj1 = " + obj1.getValue());

    }
}
