package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier{
    public int getRandomBall(){
        Random random = new Random();
        return random.nextInt(101) ;
    }

    @Override
    public String getRandomColor() {
        return super.getRandomColor();
    }
}
