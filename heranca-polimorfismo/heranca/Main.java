package heranca;

public class Main {
    static EletricCar car = new EletricCar("Civic", "Honda", 2000);

    public static void main(String[] args) {
        System.out.println("Modelo: " + car.getModel());
        System.out.println("Vendor: " + car.getVendor());
        System.out.println("Fuel type : " + car.fuelType());
    }
}
