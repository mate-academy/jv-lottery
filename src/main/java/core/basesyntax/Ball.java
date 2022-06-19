package core.basesyntax;

import java.util.Random;

public  class  Ball {
    Random randN = new Random();
    String [] colorArray = new String[]{"green", "black", "yellow","white", "purple","blue"};
    public String  color(){
     String color = colorArray[randN.nextInt(5)];
       return color;
    }

}
