package core.basesyntax;

import java.util.Random;

public class RandoM extends Enum {
    public void getRandomColor() {
        Random random = new Random();
        int index = new Random().nextInt(Enum.Color.values().length);
        Enum.Color color = Enum.Color.values()[index];
    }

    public void getRandomNumber() {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
    }
}
