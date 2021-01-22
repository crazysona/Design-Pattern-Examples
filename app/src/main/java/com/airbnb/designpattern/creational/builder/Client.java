package com.airbnb.designpattern.creational.builder;

public class Client {
  public static void main(String[] args) {
    CarBuilder builder = new CarBuilder();
    Director director = new Director();
    director.constructTypeA(builder);
    Car car = builder.getResult();
    System.out.println(car.toString());
    director.constructTypeB(builder);
    car = builder.getResult();
    System.out.println(car.toString());
    ManualBuilder manualBuilder = new ManualBuilder();
    director.constructTypeA(manualBuilder);
    System.out.println(manualBuilder.getResult().toString());
  }
}
