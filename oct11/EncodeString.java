package oct11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EncodeString {
    public static void main(String[] args) {
        // 주어진 암호표를 기준으로 문자열을 암호화하여 출력하는 문제
        // 원래 암호표의 내용이 1차원 배열로 주어지나, 편리한 탐색을 위하여 이를 해시맵으로 변환해 풀이하였다.
        // 각각 a부터 z까지의 알파벳에 매핑되는 암호문자
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};
        // 각각 0부터 9까지의 숫자에 매핑되는 암호문자
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        // 해시맵으로 변환
        Map<Character, Character> hs = new HashMap<>();

        for(int i=0 ;i<abcCode.length; i++)
            hs.put((char)('a'+i), abcCode[i]);
        for(int i=0; i<numCode.length; i++)
            hs.put((char)('0' + i), numCode[i]);


        // 암호화할 원본 문자열을 읽어오기
        Scanner sc = new Scanner(System.in);
        System.out.print("암호화할 원본 문자열을 입력하세요: ");
        String src = sc.next();
        String result = ""; // 암호화 결과를 저장할 문자열 변수

        // 암호 배열을 참조하여 문자열 암호화
        for(int i=0; i<src.length(); i++)
            result = result.concat(hs.get(src.charAt(i)).toString());

        // 결과 출력
        System.out.println("원본 문자열: " + src);
        System.out.println("암호화 결과: " + result);

        // Scanner close
        sc.close();
    }

}
