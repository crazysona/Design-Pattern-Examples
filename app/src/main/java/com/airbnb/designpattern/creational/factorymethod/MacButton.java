package com.airbnb.designpattern.creational.factorymethod;

public class MacButton implements Button {
  @Override
  public String click(int x, int y) {
    return String.format("Click button on mac os where x = %d, y = %d", x, y);
  }
}
