package com.letg.design_mode.behavior.strategy;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 11:12
 * @Description:
 */


public class QuickSortstrategy implements SortStrategy{
  @Override
  public void sort(int[] arr) {
    System.out.println("Quick sort");
  }
}
