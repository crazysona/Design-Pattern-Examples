package com.airbnb.designpattern.creational.builder;

public class Car {
  private int seats;
  private boolean useGasEngine;
  private int gpsVersion;

  public Car(int seats, boolean useGasEngine, int gpsVersion){
    this.seats = seats;
    this.useGasEngine = useGasEngine;
    this.gpsVersion = gpsVersion;
  }

  @Override
  public String toString(){
    return String.format("Car: Seats: %d, useGasEngine: %s, gpsVersion: %d", seats, useGasEngine, gpsVersion);
  }

}
