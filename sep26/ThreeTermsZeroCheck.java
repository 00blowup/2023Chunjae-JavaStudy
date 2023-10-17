package sep26;

public class ThreeTermsZeroCheck {
    
    // 삼항연산자를 활용하여 정수의 음수/양수/0 여부를 출력하는 문제
    public static void main(String[] args) {
        int num = 10;
        // 삼항 연산자를 이중으로 사용하여 풀이
        System.out.println((num == 0)? 0 : (num > 0) ? "양수" : "음수" );
    }
}
