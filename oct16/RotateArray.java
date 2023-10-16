package oct16;

public class RotateArray {
    // 주어진 2차원 배열을 시계방향으로 90도 회전시키는 문제
    // 추가로 180도와 270도 회전까지 구현함
    public static void main(String[] args) {
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };

        int row = star.length;  // 주어진 배열의 행 수
        int col = star[0].length;   // 주어진 배열의 열 수


        // 배열의 원래 모습
        System.out.println("배열의 원래 모습");
        for(int i=0; i<row; i++) {
            for (int j=0; j<col; j++) System.out.print(star[i][j]);
            System.out.println();
        }
        System.out.println();


        // 시계방향으로 90도
        System.out.println("시계방향으로 90도 회전");
        for(int i=0; i<col; i++) {
            for (int j=row-1; j>=0; j--) System.out.print(star[j][i]);
            System.out.println();
        }
        System.out.println();

        // 시계방향으로 180도
        System.out.println("시계방향으로 180도 회전");
        for(int i=row-1; i>=0; i--) {
            for (int j=col-1; j>=0; j--) System.out.print(star[i][j]);
            System.out.println();
        }
        System.out.println();

        // 시계방향으로 270도
        System.out.println("시계방향으로 270도 회전");
        for(int i=col-1; i>=0; i--) {
            for (int j=0; j<row; j++) System.out.print(star[j][i]);
            System.out.println();
        }

    }
}
