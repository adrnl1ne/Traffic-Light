package day3.TrafficLight;

import java.util.Scanner;

public class Driver {
  public static final String TEXT_RESET = "\u001b[0m";
  public static final String TEXT_RED = "\u001b[31m";
  public static final String TEXT_GREEN = "\u001b[32m";
  public static final String TEXT_YELLOW = "\u001b[33m";
  Scanner input = new Scanner(System.in);
  String in;


  public String getStringInput() {
    return input.nextLine();
  }

  public void callStringInput() {
    in = getStringInput();
  }


  public void approachLight(TrafficLight trafficLight) {
    System.out.println("You are now approaching a traffic light...");
    trafficLight.checkLight();
    stopOrGo(trafficLight);
  }

  public void stopOrGo(TrafficLight trafficLight) {
    if (trafficLight.exportLight().equals("Red")) {
      System.out.println(TEXT_RED + "You stop at the red light, " +
          "and wait a while for it to turn green..." + TEXT_RESET);
    } else if (trafficLight.exportLight().equals("Yellow")) {
      System.out.println(TEXT_YELLOW + "You lower your speed for the yellow light, " +
          "and it turns green quickly..." + TEXT_RESET);
    } else if (trafficLight.exportLight().equals("Green")) {
      System.out.println(TEXT_GREEN + "You continue driving..." + TEXT_RESET);
    }
  }

  public void finalDestination() {
    Controller controller = new Controller();
    System.out.println("Have you reached your final destination? ");
    callStringInput();
    if (in.contains("n")) {
      System.out.println("You continue driving towards the next traffic light");
      controller.run();
    } else if (in.contains("y")) {
      System.out.println("You pull over, and get out of the car");
    } else {
      System.out.println("You might have misspelled...");
      finalDestination();
    }
  }

}

