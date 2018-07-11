import model.TaxiPark;
import service.CarRepository;
import service.CarService;

public class Runner {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        TaxiPark taxiPark = new TaxiPark(carRepository.findAll());
        CarService carService = new CarService();
        carService.print(taxiPark);
        carService.sort(taxiPark);
        System.out.println();
        carService.print(taxiPark);
        System.out.println();
        System.out.println(carService.search(100, 200, taxiPark));
    }
}
