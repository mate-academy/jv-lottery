package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}
/*реализовать метод String getRandomColor () в классе ColorSupplier. Этот метод должен возвращать
случайный цвет на основе значений перечисления (используйте для этого класс Random)*/
