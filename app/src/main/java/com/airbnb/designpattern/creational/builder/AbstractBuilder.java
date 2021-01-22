package com.airbnb.designpattern.creational.builder;

public interface AbstractBuilder {
  void reset();
  void setSeats(int num);
  void setEngine(boolean useGasEngine);
  void setGPS(int version);
}
