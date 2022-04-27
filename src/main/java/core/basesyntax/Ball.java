package core.basesyntax;

public class Ball {
    private int numbers;
    private String colors;

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "numbers=" + numbers +
                ", colors='" + colors + '\'' +
                '}';
    }
}

