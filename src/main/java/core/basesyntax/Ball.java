package core.basesyntax;

import java.util.Random;

public class Ball {
    Colours colour;
    int number;

    public Ball(Colours colour, int number){
        this.colour = colour;
        this.number = number;
    }

public String toString() {
       return "Colour - " + colour + " Number - " + number;
}

}
