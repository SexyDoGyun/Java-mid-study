package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer boxedNum = Integer.valueOf(str);
        System.out.println("boxedNum = " + boxedNum);

        int unboxedNum = boxedNum.intValue();
        System.out.println("unboxedNum = " + unboxedNum);

        Integer reboxedNum = Integer.valueOf(unboxedNum);
        System.out.println("reboxedNum = " + reboxedNum);


    }
}
