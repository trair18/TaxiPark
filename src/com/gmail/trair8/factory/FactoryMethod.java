package com.gmail.trair8.factory;

public class FactoryMethod {
    public AbstractCreator getCreator(String type){
        switch (type){
            case "premium car":
                return new PremiumCarCreator();
            case "mini bus":
                return new MiniBusCreator();
        }
        return new CarCreator();
    }
}
