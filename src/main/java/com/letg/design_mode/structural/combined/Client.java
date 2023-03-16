package com.letg.design_mode.structural.combined;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 10:37
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    Leaf leaf1 = new Leaf("叶子节点1");
    Leaf leaf2 = new Leaf("叶子节点2");
    Composite composite = new Composite();
    composite.add(leaf1);
    composite.add(leaf2);
    composite.operate();
  }
}
