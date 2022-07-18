package com.airbnb.designpattern.creational.builder;

public class CarBuilder implements AbstractBuilder {

  private int seats;
  private boolean useGasEngine;
  private int gpsVersion;
  private int isHybrid;

  @Override
  public void reset() {
    seats = 0;
    useGasEngine = false;
    gpsVersion = 0;
  }

  @Override
  public void setSeats(int num) {
    seats = num;
  }

  @Override
  public void setEngine(boolean useGasEngine) {
    this.useGasEngine = useGasEngine;
  }

  @Override
  public void setGPS(int version) {
    gpsVersion = version;
  }

  public Car getResult() {
    return new Car(seats, useGasEngine, gpsVersion);
  }
}
