package com.letg.design_mode.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/14 14:41
 * @Description:
 */


public class PersonList implements Iterable<Person> {
    private List<Person> list;

    public PersonList() {
        list = new ArrayList<>();
    }

    void add(Person person) {
        if (!list.contains(person)) list.add(person);
    }

    @Override
    public Iterator<Person> iterator() {
        return list.iterator();
    }
}
