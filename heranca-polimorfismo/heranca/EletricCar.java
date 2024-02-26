package heranca;

class EletricCar extends Car {
    public EletricCar(String model, String vendor, int yearOfManufacture) {
        super(model, vendor, yearOfManufacture);
    }

    protected String fuelType() {
        return "Electricity";
    }
}