package com.letg.design_mode.behavior.memo;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 10:09
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    Originator originator = new Originator("state 0");
    Caretaker caretaker = new Caretaker();
    caretaker.addMemento(originator.saveToMemento());
    originator.setState("state 1");
    caretaker.addMemento(originator.saveToMemento());

    System.out.println(caretaker.getMemento(0));
    System.out.println(caretaker.getMemento(1));
  }
}
