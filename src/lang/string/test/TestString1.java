package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        boolean OX = false;
        if (url.startsWith("https://")) {
            OX = true;
        }
        System.out.println(OX);
    }
}
