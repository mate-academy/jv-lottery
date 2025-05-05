public class Ball {
    Color color;
    int number;

    Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }


    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
