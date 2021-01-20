package com.airbnb.designpattern.creational.abstractfactory;

public class ClassicFactory implements AbstractFactory {
  @Override
  public Chair createChair() {
    return new ClassicChair();
  }

  @Override
  public Table createTable() {
    return new ClassicTable();
  }
}
