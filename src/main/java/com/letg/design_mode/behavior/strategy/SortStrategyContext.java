package com.letg.design_mode.behavior.strategy;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 11:14
 * @Description:
 */


public class SortStrategyContext {
    private SortStrategy strategy;
    public SortStrategyContext(SortStrategy strategy){
        this.strategy = strategy;
    }
    public void sort(int[] arr){
        this.strategy.sort(arr);
    }
    public void changeSortStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }
}
