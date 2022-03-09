package day3.TrafficLight;

public class TrafficLight {
  public static final String TEXT_PURPLE = "\u001b[35m";
  public static final String TEXT_RESET = "\u001b[0m";

  private enum trafficLightColor{
    Red,
    Yellow,
    Green
  }
  trafficLightColor myVar;


  public void currentColor(RandomGen randomGen) {
    if (randomGen.colorOfLight() == 1) {
      myVar = trafficLightColor.Red;
    } else if (randomGen.colorOfLight() == 2) {
      myVar = trafficLightColor.Yellow;
    } else if (randomGen.colorOfLight() == 3) {
      myVar = trafficLightColor.Green;
    }
  }

  public void checkLight() {
    System.out.println(TEXT_PURPLE + "The current color of the traffic light is " + myVar + TEXT_RESET);
  }

  //Getter
  public String exportLight() {
    return myVar.name();
  }

}
