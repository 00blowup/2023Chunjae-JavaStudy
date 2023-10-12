package Oct12;

public class ThreeRobots {
    // Robot 클래스를 상속하는 세 가지 로봇 클래스가 있을 때,
    // 로봇의 종류에 따라 서로 다른 행동을 하도록 하는 문제

    // action 함수
    static void action(Robot r) {
        // getClass()와 .class를 사용하여 클래스 정보를 가져온 뒤 비교한다.
        if(r.getClass().equals(DanceRobot.class)) ((DanceRobot) r).dance();
        else if(r.getClass().equals(SingRobot.class)) ((SingRobot) r).sing();
        else ((DrawRobot)r).draw();
    }

    // main 메소드
    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for(int i=0; i<arr.length; i++)
            action(arr[i]);
    }
}

// 부모 클래스인 Robot
class Robot {}

//Robot을 상속받는 3개의 자식 클래스
class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println("노래");
    }
}
class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림");
    }
}