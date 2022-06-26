package core.basesyntax;

public class Ball {
   private String Color;
   private int number;

   public Ball() {}

   public Ball(String color, int number) {
      this.Color = color;
      this.number = number;
   }

   public String toString(){
      return "Ball`s color / number: " + Color + " / " + number;
   }
}
