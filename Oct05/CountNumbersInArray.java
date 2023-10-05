package Oct05;

public class CountNumbersInArray {
    // 1차원 정수 배열 안의 숫자를 세어, 각 숫자의 개수만큼 별을 찍는 문제 (숫자의 범위가 1~4로 한정된 경우)
    public static void main(String[] args) {
        // 세어야 하는 숫자들이 저장된 배열
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        // 숫자의 범위가 1~4로 고정되어있으므로 1차원 배열을 이용해 셀 수 있음.
        int[] count = new int[4];

        for(int i: answer) count[i-1]++;

        for(int i=0; i<4; i++) {
            System.out.print(i+1 + "의 개수: " + count[i] + " ");
            for(int j=0; j<count[i]; j++) System.out.print("*");
            System.out.println();
        }
    }
}
