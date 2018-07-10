public class Runner {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        TaxiPark taxiPark = new TaxiPark(carRepository.findAll());
        System.out.println(taxiPark.getCars());

    }
}
