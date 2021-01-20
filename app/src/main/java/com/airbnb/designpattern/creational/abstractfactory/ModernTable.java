package com.airbnb.designpattern.creational.abstractfactory;

public class ModernTable implements Table {
  @Override
  public String place(String item) {
    return String.format("Place %s on a modern table", item);
  }
}
