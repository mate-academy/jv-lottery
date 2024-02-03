package core.basesyntax;

public class Ball {
    private String collor;
    private int number;

    public String getCollor() {
        return collor;
    }

    public int getNumber() {
        return number;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball " + "collor = " + collor
                + " number = " + number;
    }
}
