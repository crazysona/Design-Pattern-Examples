package com.airbnb.designpattern.creational.factorymethod;

public class Client {
  public static void main(String[] args) {
    String system = "win";
    ButtonFactory factory = null;
    if (system == "mac") {
      factory = new WinButtonFactory();
    } else {
      factory = new MacButtonFactory();
    }
    factory.play();
  }
}
