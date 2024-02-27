enum Color {
    RED, BLUE, YELLOW, GREEN
}

 public class Ball {
    private Color color;
    private int number;
    public Ball(Color color, int number){
        this.color = color;
        this.number = number;
    }
}
@Override
public  String  toString() {
    return "Шар: цвет - " + color + ", номер - " + number;
}
