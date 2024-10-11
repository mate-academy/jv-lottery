package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public Colori getRandomColor() {

        int randomIndex = new Random().nextInt(Colori.values().length);
        return Colori.values()[randomIndex];
    }


}
