package com.gmail.trair8.view;

import com.gmail.trair8.model.TaxiPark;
import com.gmail.trair8.repository.TaxiParkRepository;
import com.gmail.trair8.service.TaxiParkService;

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
            } else if(s.equals("print()")){
                taxiParkService.print(taxiPark);
            } else if(s.matches("search\\(\\d+, \\d+\\)")) {
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(s);
                m.find();
                int i = Integer.parseInt(m.group());
                m.find();
                int j = Integer.parseInt(m.group());
                System.out.println(taxiParkService.search(i, j, taxiPark));
            }else if(s.equals("cost()")){
                System.out.println(taxiParkService.cost(taxiPark));
            } else {
                System.out.println("try again");
            }
        }
    }
}
