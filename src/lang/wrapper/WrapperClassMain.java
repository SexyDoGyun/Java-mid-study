package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInterger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
//        System.out.println("newInterger = " + newInterger);
        Long LongObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("integerObj = " + integerObj);
        System.out.println("LongObj = " + LongObj);
        System.out.println("doubleObj = " + doubleObj);

        //언박싱
        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = LongObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==" + (newInterger == integerObj));
        System.out.println("equals" + (newInterger.equals(integerObj)));

    }
}
