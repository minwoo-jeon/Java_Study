package static2.ex;

public class Car {
    private  String name;
    private  static int total;

    Car(String name) {
        System.out.println("차량 구입, 이름:" +name);
        this.name = name;
            total++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : "+ total);
    }
}
