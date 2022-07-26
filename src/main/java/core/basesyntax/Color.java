package core.basesyntax;

import java.util.Random;

public enum Color {

    RED("Красный"),
    BLUE("Синий"),
    GREEN("Зелёный"),
    GRAY("Серый"),
    PURPLE("Фиолетовый"),
    PINK("Розовый"),
    YELLOW("Жёлтый"),
    WHITE("Белый"),
    BLACK("Черный");

    private String color;
    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        Random random = new Random();
        int numberColor = random.nextInt(8) + 1;
        Color.valueOf(String.valueOf(numberColor));
        return "";
    }
}
