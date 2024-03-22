package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() { // vozvrashaem String
        int index = new Random().nextInt(Colors.values().length); // генерує випадкове
        // ціле число від 0 (включно) до розміру enum (не включно).
        // Це число представляє індекс випадкової константи.
        Colors color = Colors.values()[index]; //отримує константу enum
        // за випадково згенерованим індексом.
        return String.valueOf(color); // delaem stringom
    }
}
