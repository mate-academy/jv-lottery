package core.basesyntax;

public class Ball {
   private ColorDiff color;

    private Integer number;

  //  public ColorDiff getColor() {
   //     return color;
  // }

  //  public Integer getNumber() {
  //      return number;
   // }

    public void setColor(ColorDiff color) {
        this.color = color;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
       // String[] color2 = new String[] {"red", "orange", "yellow", "green", "blue", "indigo", "violet" };

        return "number = " + number.toString() + " color = " + color;
    }

}
