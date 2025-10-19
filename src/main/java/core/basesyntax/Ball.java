package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    // Перевизначаємо toString() для виведення інформації про кульку
    @Override
    public String toString() {
        return "Ball {color: " + color + ", number: " + number + "}";
    }
}
