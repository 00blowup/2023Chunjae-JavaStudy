package oct05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class CountNumbersInArray_NoLimit {
    // 1차원 정수 배열 안의 숫자를 세어, 각 숫자의 개수만큼 별을 찍는 문제 (숫자의 범위가 1~1,000,000으로 확장된 경우)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 각 수의 개수를 저장할 TreeMap (자동정렬을 위해 사용)
        Map<Integer, Integer> count = new TreeMap<>();

        // 수 읽어오기
        System.out.println("1~1,000,000 범위의 수를 입력하세요. 입력을 종료하고 싶다면 0을 입력하세요.");
        while(true) {
            int input;
            // 입력값이 올바르지 않을 경우의 예외처리
            try{
                input = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("입력값이 올바르지 않습니다. 다시 입력해주세요.");
                continue;
            }
            // 입력값이 0 미만 혹은 1000000 초과일 경우를 처리
            if (input<0 || input>1000000) {
                System.out.println("수가 너무 작거나 큽니다. 1~1,000,000 범위의 수를 입력해주세요.");
                continue;
            }

            // 입력값이 0이라면 break
            if(input == 0) break;
            // 그렇지 않다면 개수를 세기
            // 센 적 있는 수라면 TreeMap에 저장된 지금까지의 개수에 1을 덧셈
            if(count.containsKey(input)) count.put(input, count.get(input) +1);
            // 센 적 없는 수라면 TreeMap에 새로운 요소로 추가
            else count.put(input, 1);
        }

        // 결과 출력
        for (Integer i : count.keySet()) {
            System.out.print(i+1 + "의 개수: " + count.get(i) + " ");
            for(int j=0; j<count.get(i); j++) System.out.print("*");
            System.out.println();
        }

    }

}
