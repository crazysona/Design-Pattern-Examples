package com.airbnb.designpattern.creational.factorymethod;

public class WinButton implements Button {
  @Override
  public String click(int x, int y) {
    return String.format("Click button on windows os where x = %d, y = %d", x, y);
  }
}
