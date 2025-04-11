package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        long longvalue = 32131;
        Long boxedLong = longvalue;
        System.out.println("boxedLong = " + boxedLong);

        long unboxecLong = boxedLong;
        System.out.println("unboxecLong = " + unboxecLong);
        //Wrapper -> primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
