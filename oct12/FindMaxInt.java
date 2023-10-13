package oct12;

import java.util.Arrays;

public class FindMaxInt {
    // 주어진 정수 배열의 요소들 중 최댓값을 리턴하는 메소드를 작성하는 문제
    // 단, 조건문이 아닌 예외처리를 통해 null 값과 빈 배열을 처리하였다.

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 10, 4, 2, 7, 4}));
        System.out.println(findMax(null));
        System.out.println(findMax(new int[]{}));
    }

    static int findMax (int[] arr) {
        // 배열 정렬 과정에서 null 예외처리
        try {
            Arrays.sort(arr);
        } catch (NullPointerException e) {
            System.out.print("주어진 배열이 null입니다. ");
            return -999999;
        }

        // 최댓값 리턴 과정에서 빈 배열 예외처리
        try {
            return arr[arr.length-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("주어진 배열이 비어있습니다. ");
            return -999999;
        }
    }
}
