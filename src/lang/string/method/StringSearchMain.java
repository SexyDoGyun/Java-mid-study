package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java World.";

        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.contains("Java"));
        System.out.println("'Java'의 첫 번째 인덱스: " + str.indexOf("Java")); //첫 번째 자바의 J 인덱스는 7번
        System.out.println("인덱스 10부터 'Java'의 인덱스: " + str.indexOf("Java",10)); //인덱스 10에서 부터 나오는 자바의 J 인덱스는 24번
        System.out.println("'Java'의 마지막 인덱스: " + str.lastIndexOf("Java")); //뒤에서부터 Java의 인덱스



    }
}
