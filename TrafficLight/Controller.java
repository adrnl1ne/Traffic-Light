package day3.TrafficLight;

public class Controller {

  TrafficLight trafficLight = new TrafficLight();
  RandomGen randomGen = new RandomGen();
  Driver driver = new Driver();

  public void run() {
    randomGen.faceValue();
    trafficLight.currentColor(randomGen);
    driver.approachLight(trafficLight);
    driver.finalDestination();
  }
}
