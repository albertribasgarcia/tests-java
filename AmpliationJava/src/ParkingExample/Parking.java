package ParkingExample;

import java.util.Random;

public class Parking {
    int plazasPiso1 = 0;
    int plazasPiso2 = 0;

    public Parking(){

    }

    public synchronized boolean aparcar(){
        if (new Random().nextBoolean()) {
            return aparcarPiso1();
        } else {
            return aparcarPiso2();
        }
    }

    public synchronized boolean aparcarPiso1(){
        if (plazasPiso1 > 10) cambioPiso(true);
        else {
            plazasPiso1++;
            return true;
        }
        return false;
    }

    public synchronized void cambioPiso(boolean bajo) {
        try {
            if (bajo){
                while (plazasPiso2 > 10 ) {
                    System.out.println("Todo el parking lleno");
                    wait();
                }
                 aparcarPiso2();
            }else{
                while (plazasPiso1 > 10 ) {
                    System.out.println("Todo el parking lleno");
                    wait();
                }
                 aparcarPiso1();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized boolean aparcarPiso2(){
        if (plazasPiso2 > 10) cambioPiso(false);
        else {
            plazasPiso2++;
            return false;
        }
        return false; //nunca llegará a aquí de todas formas
    }

    public synchronized void salirPiso1(){
        plazasPiso1--;
        if (plazasPiso1==1) System.out.println("Sale piso 1");
        notify();
    }

    public synchronized void salirPiso2(){
        plazasPiso2--;
        if (plazasPiso2==9) System.out.println("Sale piso 2");
        notify();
    }
}
