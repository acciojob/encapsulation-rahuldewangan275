package com.driver;

public class Main {
  public static void main (String[] args){

      RWOnly obj = new RWOnly();
//      obj.name ="Rahul"; // ERROR : java: name has private access in com.driver.RWOnly
//      System.out.println();
       obj.setter("Rahul");
       System.out.println(obj.getter());
  }
}