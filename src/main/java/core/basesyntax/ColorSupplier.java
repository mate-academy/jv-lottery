package core.basesyntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        List<String> colorList = new ArrayList<>();
        Colors[] colors = Colors.values();
        Arrays.stream(colors).forEach(c -> colorList.add(c.name()));

        return new String(colorList
                .get(new Random().nextInt(colorList.size() - 1)));
    }
}
