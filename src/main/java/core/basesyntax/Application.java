package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        int number_of_lottery = 3;//number of 3 lottery
        Lottery[] lottery = new Lottery[number_of_lottery];
        // array of new lottery
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = new Lottery();
        }
        //sout result 3 ball
        for (int i = 0; i < lottery.length; i++) {
            System.out.println(lottery[i].getRandomBall().getColor() + " "
                    + lottery[i].getRandomBall().getNumber());
        }
    }

}
