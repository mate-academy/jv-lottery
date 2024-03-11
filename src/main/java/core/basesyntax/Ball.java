package core.basesyntax;

public class Ball {
    private String colour;
    private int number;

    public Ball(Color randomColor, int randomNumber) {
    }

    @Override
    public String toString() {
        return colour + number;
    }
}
