package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.parentMethod();
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드
        String string = child.toString();
        Class<? extends Child> aClass = child.getClass();
        System.out.println(aClass);
        System.out.println(string);
    }
}
