package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class classMetaMain {
    public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz = String.class; //클래스에서 조회
//        Class clazz1 = new String().getClass(); //인스턴스에서 조회
//        Class clazz2 = Class.forName("java.lang.String"); //문자열로 조회

        //모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        //모든 메서드 출력
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        //상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        
        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface.getName());
        }
    }
}
