package sep26;

public class LeastSignificantDigitToOne {

    // 주어진 정수의 일의 자리를 1로 바꾸는 문제
    public static void main(String[] args) {
        int num = 333;

        // 풀이방법1 연산을 통해 푸는 방식
        System.out.println(num/10 + "1");   // 나눗셈을 활용하여 풀이

        // 풀이방법2 문자열로 변환하여 푸는 방식
        String str = Integer.toString(num); // 주어진 수를 문자열로 변환
        for(int i=0; i<str.length()-1; i++) {   // 문자열의 마지막 글자만 빼고 출력
            System.out.print(str.charAt(i));
        }
        System.out.println(1);  // 마지막 글자 대신 1 출력
    }
}
