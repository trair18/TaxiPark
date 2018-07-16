package com.gmail.trair8.view;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.TaxiPark;
import com.gmail.trair8.repository.TaxiParkRepository;
import com.gmail.trair8.service.TaxiParkService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Console {

    public static void console(TaxiParkService taxiParkService, TaxiPark taxiPark){
        TaxiParkRepository taxiParkRepository = new TaxiParkRepository();
        taxiPark.setCars(taxiParkRepository.findAll());

        Scanner scanner = new Scanner(System.in);
        String s;

        while (!(s = scanner.nextLine()).equals("exit")){
            if(s.equals("sort()")){
                taxiParkService.sort(taxiPark);
                print(taxiPark.getCars());
            } else if(s.equals("print()")){
                print(taxiPark.getCars());
            } else if(s.matches("search\\(\\d+, \\d+\\)")) {
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(s);
                m.find();
                int i = Integer.parseInt(m.group());
                m.find();
                int j = Integer.parseInt(m.group());
                print(taxiParkService.search(i, j, taxiPark));
            }else if(s.equals("getCost()")){
                System.out.println(taxiParkService.getCost(taxiPark));
            } else {
                System.out.println("try again");
            }
        }
        scanner.close();
    }

    private static void print(ArrayList<Car> cars){
        for (Car car: cars) {
            System.out.println(car);
        }
    }
}
