package core.basesyntax;

public class Ball {
    private String color;
    private int number;
    public Ball(String color, int number){
        this.color = color;
        this.number = number;
    }
    public String getColor(){
        return color;
    }
    public int getNumber(){
        return number;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setNumber(int number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball with number: "
                + getNumber()
                + " and color is: "
                + getColor();
    }
}
