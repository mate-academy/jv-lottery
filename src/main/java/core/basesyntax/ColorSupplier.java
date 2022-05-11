package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    //public String getRandomColor() {
        //return null;
        public Colors getRandomColor() {
            int index = new Random().nextInt(Colors.values().length);
            return Colors.values()[index];
        }
}
