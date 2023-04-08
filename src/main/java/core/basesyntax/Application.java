package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] ball = new Ball[3];
        Lottery llottery = new Lottery();
        for(int i = 0; i < ball.length; i++){
            ball[i] = llottery.getRandomBall();
            System.out.println(ball[i].toString());
        }
    }
}