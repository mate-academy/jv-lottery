package core.basesyntax;

import java.util.Random;

public class Ball {
    String color;
    int number;
    Ball (String color, int number){
        int index = new Random().nextInt(Color.values().length);
        this.color = color;
        this.number = number;
    }
    @Override
    public String toString (){
        return "Color = " + this.color + ";\n Number = " + this.number + ";";
    }
}
