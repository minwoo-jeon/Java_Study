package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택 K3
        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경 (k3 -> model13)
        Car modle3Car = new Model3Car();
        driver.setCar(modle3Car);
        driver.drive();

        //차량 변경 ( model13 -> newCar)
        Car newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();

    }
}
