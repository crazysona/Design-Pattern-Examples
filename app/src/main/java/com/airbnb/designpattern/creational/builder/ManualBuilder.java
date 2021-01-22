package com.airbnb.designpattern.creational.builder;

public class ManualBuilder implements AbstractBuilder {

  private int seats;
  private boolean useGasEngine;
  private int gpsVersion;

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

  public Manual getResult() {
    return new Manual(seats, useGasEngine, gpsVersion);
  }
}
