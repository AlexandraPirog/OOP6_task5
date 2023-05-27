package Vehicle;


import InterfaceCar.RefillEngine;

public class Car{
    private RefillEngine refillEngine;

    public Car(RefillEngine refillEngine){
        this.refillEngine = refillEngine;
    }
    public void RefillEngine() {
        this.refillEngine.refillEngine();
    }
}
