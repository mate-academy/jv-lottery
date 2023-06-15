package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    private static final int FIGURE_COUNT = 100;
    private Random random = new Random();
   // public Lottery(String color, int number) {
    //    super(color, number);
    //}


    public Ball getRandomBall(String color, int number){

        //int figureNumber = random.nextInt(Colors.values().length);
        number = random.nextInt(FIGURE_COUNT);
        color = String.valueOf(Colors.values()[number]);
        return new Ball();
    }
}
