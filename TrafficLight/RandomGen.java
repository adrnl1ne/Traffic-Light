package day3.TrafficLight;

import java.util.Random;

public class RandomGen {
  Random random = new Random();
  private int chooseLight;

  //getter
  public int colorOfLight() {
    return chooseLight;
  }

  //getter
  public void faceValue() {
    roll();
  }

  //setter
  public void roll() {
    chooseLight = random.nextInt(3) + 1;
  }

}
