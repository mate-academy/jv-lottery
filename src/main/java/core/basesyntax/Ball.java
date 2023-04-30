package core.basesyntax;

public class Ball {

        String color;
        int number;

        public Ball() {
        }

       @Override
        public String toString() {
            return "Ball: color = " + this.color + ", number = " + this.number;
        }
}
