package com.letg.design_mode.behavior.memo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/15 10:01
 * @Description:
 */


public class Caretaker {
    private List<Memento> mementos;
    public Caretaker(){
        mementos = new ArrayList<>();
    }
    public Memento getMemento(int index){
        return mementos.get(index);
    }

    public void addMemento(Memento memento){
        mementos.add(memento);
    }
}
