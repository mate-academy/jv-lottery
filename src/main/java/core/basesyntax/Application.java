package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] lotteryBall = new Ball[3];
        Lottery lottery = new Lottery();
        for(int i=0; i<3; i++){
            lotteryBall[i] = lottery.getRandomBall();
            System.out.println(lotteryBall[i].toString());
        }
    }
}
