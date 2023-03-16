package com.letg.design_mode.cretor.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:letg(pz)
 * @Date: 2023/3/10 17:02
 * @Description:
 */


public class Client {
    public static void main(String[] args) {
//        Car car = new Car("丰田", 140000,new Object());
//        Prototype prototype = new Prototype();
//        prototype.registerObj("丰田",car);
//        Car cloneCar = prototype.clone("丰田");
//        System.out.println(cloneCar.getFrom() == car.getFrom());


    }
}

/**
 * 原型对象
 */
class Prototype {
    //存放实例的map
    private Map<String, Object> prototypeMap;

    public Prototype() {
        this.prototypeMap = new HashMap<>();
    }
    //注册对象
    public void registerObj(String name,Object o){
        prototypeMap.put(name,o);
    }

    public void unRegisterObj(String name){
        prototypeMap.remove(name);
    }

    public Car clone(String name){
        return ((Car)(prototypeMap.get(name))).clone();
    }

}

/**
 * Car继承Cloneable
 */
class Car implements Cloneable{
    private String carName;
    private int price;
    private Object from;
    public Car(){

    }
    public Car(String carName, int price,Object from) {
        this.carName = carName;
        this.price = price;
        this.from = from;
    }
    public Car clone(){
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Car(this.carName,this.price,this.from);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getCarName() {
        return carName;
    }

    public int getPrice() {
        return price;
    }

    public Object getFrom() {
        return from;
    }
}
