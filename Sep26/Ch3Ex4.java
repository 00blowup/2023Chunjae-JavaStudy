package Sep26;

public class Ch3Ex4 {

    // 정수 num의 값 중 백의 자리 아래를 버리는 문제
    public static void main(String[] args) {
        int num = 456;
        // 나머지 연산자를 활용하여 풀이
        System.out.println(num - (num % 100));
    }
}
