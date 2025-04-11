package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String str = "      Java Programming ";

        System.out.println("소문자로 변환: " + str.toLowerCase());
        System.out.println("대문자로 변환: " + str.toUpperCase());

        System.out.println("공백 제거(trim): " + str.trim()); //trim()은 문자열 양쪽 공백 제거. 단순 whitespace만 제거 예: 스페이스바 공백
        System.out.println("공백 제거(strip): " + str.strip()); //strip은 trim과 동작이 비슷하지만 whitespace와 유니코드 공백을 포함해서 제거
        System.out.println("앞 공백 제거(strip): " + str.stripLeading()); //앞 공백 제거
        System.out.println("뒤 공백 제거(strip): " + str.stripTrailing()); //뒤 공백 제거



    }
}
