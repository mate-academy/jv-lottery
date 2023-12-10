package core.basesyntax;

public class Ball {

    private String color;
    private int number;

    public Ball(int number, String color) {

        boolean checkColor = isColor(color);
        if (number < 100 && number > 0 && checkColor) {
            this.number = number;
            this.color = color;
        } else {
            System.out.println("Wrong color or Number is not between 0 and 100 ");
        }
    }

    public void setNumber(int number) {

        if (number < 100 && number > 0) {
            this.number = number;
        } else {
            System.out.println("Ball number has to between 0 and 100!");
        }
    }

    public void setColor(String color) {

        if (isColor(color)) {
            this.color = color;
        } else {
            System.out.println("Wrong color");
        }
    }

    private boolean isColor(String color) {

        boolean checkColor = false;
        for (int i = 0; i < Color.values().length; i++) {
            if (color.equals(Color.values()[i].toString())) {
                checkColor = true;
            }
        }
        return checkColor;
    }

    @Override
    public String toString() {
        return "Ball number is : " + number + "\nBall color is : " + color;
    }
}

