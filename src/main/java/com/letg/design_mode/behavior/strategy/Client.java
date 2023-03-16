package com.letg.design_mode.behavior.strategy;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 11:16
 * @Description:
 */


public class Client {
  public static void main(String[] args) {
    SortStrategyContext context = new SortStrategyContext(new QuickSortstrategy());
    int[] arr = {};
    context.sort(arr);
    context.changeSortStrategy(new BubbleSortStrategy());
    context.sort(arr);
  }
}
