package com.letg.design_mode.behavior.strategy;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 11:14
 * @Description:
 */


public class BubbleSortStrategy implements SortStrategy{
  @Override
  public void sort(int[] arr) {
    System.out.println("Bubble sort");
  }
}
