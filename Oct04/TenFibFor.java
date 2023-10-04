package Oct04;

public class TenFibFor {
    // 피보나치 수열의 첫 10개 수를 for문을 사용해 출력하는 문제
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        System.out.print(num1 + "," + num2);

        for (int i=0; i<8; i++) {
            num3 = num1+num2;   // 새 숫자를
            System.out.print("," + (num3));
            num1 = num2;
            num2 = num3;
        }

    }
}
