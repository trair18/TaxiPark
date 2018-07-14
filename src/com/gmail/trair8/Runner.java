package com.gmail.trair8;

import com.gmail.trair8.model.TaxiPark;
import com.gmail.trair8.service.TaxiParkService;
import com.gmail.trair8.view.Console;

public class Runner {
    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark();
        TaxiParkService taxiParkService = new TaxiParkService();
        Console.console(taxiParkService, taxiPark);
    }
}
