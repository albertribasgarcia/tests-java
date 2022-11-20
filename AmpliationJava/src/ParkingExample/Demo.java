package ParkingExample;

import static java.lang.Thread.sleep;

public class Demo {
    public static void main(String[] args) {
        int cont = 0;
        Parking p = new Parking();
        while (cont < 60){
            Vehiculo v = new Vehiculo(p);
            v.start();
            cont++;
        }
    }
}
