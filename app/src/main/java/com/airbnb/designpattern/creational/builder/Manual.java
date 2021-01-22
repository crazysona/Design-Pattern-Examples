package com.airbnb.designpattern.creational.builder;

public class Manual{
  private int seats;
  private boolean useGasEngine;
  private int gpsVersion;

  public Manual(int seats, boolean useGasEngine, int gpsVersion){
    this.seats = seats;
    this.useGasEngine = useGasEngine;
    this.gpsVersion = gpsVersion;
  }

  @Override
  public String toString(){
    return String.format("Manual : Seats: %d, useGasEngine: %s, gpsVersion: %d", seats, useGasEngine, gpsVersion);
  }

}
