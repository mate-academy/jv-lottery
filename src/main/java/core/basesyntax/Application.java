package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        StringBuilder builder = new StringBuilder("Balls: \n");
        for (int i = 0; i < balls.length; i++) {
            balls[i] = Lottery.getRandomBall();
            builder.append(i + 1).append(") ").append(balls[i].toString()).append('\n');
        }    
        System.out.println(builder.toString());
    }
}
