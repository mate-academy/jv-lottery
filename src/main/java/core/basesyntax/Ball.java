package core.basesyntax;

public class Ball extends ColorSupplier {
    
    private int number;
    private String color;

  // public String getColor() {
     //  return this.color;
  //  }

   // public int getNumber() {
    //    return this.number;
   // }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "The number is:  " + this.number +
                "\n The color is: " + this.color;
    }
}
