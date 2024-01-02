package poly.car0;

public class Driver {

    private  K3Car k3Car; // x002 대입
    private  Model3Car model3Car; //추가

    public void setK3Car(K3Car k3Car  /* 메인에서 k3car = x002가 넘어옴*/ ) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }

    }
}
