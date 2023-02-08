package core.basesyntax;

public class Ball {
    String color;
    int num;

    public Ball(String color,int num){
        this.color = color;
        this.num = num;
    }
    @Override
    public String toString() {
        return "Color: " + color + " \n" + "Number: " + num + "\n";
    }
}
