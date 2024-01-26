package core.basesyntax;

public class Ball {
    private String collor;
    private int number;

    Ball(String collor, int number) {
        this.collor = collor;
        this.number = number;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "collor='" + collor + '\''
                + ", number=" + number
                + '}';
    }
}
