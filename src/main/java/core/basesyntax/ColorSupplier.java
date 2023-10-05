package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Lotterey lotterey = new Lotterey();
    public String getRandomColor() {
        return lotterey.getColor();
    }

    class Lotterey {
        private Random random = new Random();

        private int index = random.nextInt(Colors.values().length);
        private Colors color = Colors.values()[index];

        public String getColor() {
            return color.name();
        }
    }
}
