package core.basesyntax;

public class Ball {
    private String color;
    private int number;
    public Ball (String color, int number){
        this.color = color;
        this.number = number;
    }
    public String getColor(){
        return this.color;
    }
    public int getNumber(){
        return this.number;
    }
    public String setColor(String color){
        this.color = color;
        return color;
    }
    public int setNumber(){
        this.number = number;
        return number;
    }

    @Override
    public String toString() {
        return this.number + " " + this.color;
    }
}
