package com.gmail.trair8.factory;


public class FactoryMethod {
    public AbstractCreator getCreator(String type){
        if(type.equals("mini bus")){
            return new MiniBusCreator();
        } else return new CarCreator();
    }
}
