package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
<<<<<<< HEAD

    private int index;

=======
    private int index;
>>>>>>> 4dbe78baedef7bfc41806d2e558a597ab5d791c9
    public String getRandomColor() {
        index = new Random().nextInt(Color.values().length);
        Color colorRandom = Color.values()[index];
        return colorRandom.name();
    }
}
