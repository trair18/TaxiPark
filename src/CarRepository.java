import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarRepository {
    public ArrayList<Car> findAll(){
        ArrayList<Car> cars = new ArrayList<Car>();
        String type;
        int id;
        String name;
        double fuelConsumption;
        int speed;
        try {
            Scanner scanner = new Scanner(new File("cars.txt"));
            while (scanner.hasNextLine()){
                String[] s = scanner.nextLine().split(", ");
                type = s[0];
                id = Integer.valueOf(s[1]);
                name = s[2];
                fuelConsumption = Double.valueOf(s[3]);
                speed = Integer.valueOf(s[4]);
                switch (type){
                    case "car":
                        cars.add(new Car(id, name, fuelConsumption, speed));
                        break;
                    case "premium car":
                        boolean wifi = Boolean.valueOf(s[5]);
                        boolean monitor = Boolean.valueOf(s[6]);
                        cars.add(new PremiumCar(id, name, fuelConsumption, speed, wifi, monitor));
                        break;
                    case "mini bus":
                        String function = s[5];
                        cars.add(new MiniBus(id, name, fuelConsumption, speed, function));
                        break;
                }
            }
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        return cars;
    }
}
