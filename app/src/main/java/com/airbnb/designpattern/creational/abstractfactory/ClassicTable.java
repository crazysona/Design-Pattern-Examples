package com.airbnb.designpattern.creational.abstractfactory;

public class ClassicTable implements Table {
  @Override
  public String place(String item) {
    return String.format("Place %s on a classic table", item);
  }
}
