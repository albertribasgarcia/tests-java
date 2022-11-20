package ParkingExample;

import java.util.Random;

public class Vehiculo extends Thread {
    Parking p;
    public Vehiculo(Parking p){
        this.p = p;
    }

    public void run(){
        try {
            System.out.println(this.getName() + " entra en Parking");
            sleep(500);
            boolean b = new Random().nextBoolean();
            if (b) {
                System.out.println(this.getName()+ " Primer Piso");
                b = p.aparcarPiso1();
            }
            else {
                System.out.println(this.getName()+ " Segundo Piso");
                b = p.aparcarPiso2();
            }
            int x = new Random().nextInt(8);
            sleep(x*1000);

                    if (b) p.salirPiso1();
                    else p.salirPiso2();
            System.out.println(this.getName() + " sale del Parking" + ((b)? '1': '2'));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
