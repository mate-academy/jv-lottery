package core.basesyntax;

import java.util.Random;

public class Lottery {

    public String getRandomBall(){
        int number = new Random().nextInt(100);

        return new ColorSupplier().getRandomColor() + number;
    }


}