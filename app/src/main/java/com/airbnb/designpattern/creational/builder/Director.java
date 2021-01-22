package com.airbnb.designpattern.creational.builder;

public class Director {

  public void constructTypeA(AbstractBuilder builder){
    builder.reset();
    builder.setEngine(true);
    builder.setGPS(2);
    builder.setSeats(3);
  }

  public void constructTypeB(AbstractBuilder builder){
    builder.reset();
    builder.setEngine(false);
    builder.setGPS(1);
    builder.setSeats(1);
  }
}
