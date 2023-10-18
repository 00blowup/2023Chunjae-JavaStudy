package oct17;

import java.util.Scanner;

public class PalindromString {
    // 주어진 정수가 펠린드롬인지 판단하는 문제
    // 단, toString()과 charAt()을 사용하여 풀이함

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String str = Integer.toString(num);

        int len = str.length();

        boolean check = true;
        for(int i=0; i<len/2; i++) {
            if(str.charAt(i) == str.charAt(len-i-1)) continue;
            else {
                check = false;
                break;
            }
        }

        if(check) System.out.println(num + "는 팰린드롬입니다.");
        else System.out.println(num + "는 팰린드롬이 아닙니다.");

        sc.close();

    }
}
