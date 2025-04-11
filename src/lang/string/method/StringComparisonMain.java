package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //대문자 일부 있음
        String str2 = "hello, java!"; //대문자 없음 모두 소문자
        String str3 = "hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); //b - a = 1 a랑 b는 하나 차이난다
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));

        System.out.println("srt1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("srt1 ends with 'Java!': " + str1.endsWith("Java!"));

    }
}
