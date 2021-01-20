package com.airbnb.designpattern.creational.abstractfactory;

public class ModernChair implements Chair{
  @Override
  public String sit(String name) {
    return String.format("%s is sitting on a modern chair", name);
  }
}
