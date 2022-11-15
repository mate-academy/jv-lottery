package core.basesyntax;

class Ball {
    private int number = 0;
    private Colors color;
    public void setNumber(int number1) {
        this.number = number1;
    }

    public int getNumber() {
        return number;
    }
    public void setColor (Colors color1) {
        this.color = color1;
    }

    public Colors getColor() {
        return color;
    }


}

enum Colors {
    White,
    Black,
    Grey,
    Green,
    Blue,
    Red
}



