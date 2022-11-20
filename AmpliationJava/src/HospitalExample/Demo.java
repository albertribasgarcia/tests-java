package HospitalExample;

import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Room room = new Room();
        Friend f = new Friend(room);
        Doctor d = new Doctor(room);
        Display display = new Display(room);
        display.start();
        Friend f2 = new Friend(room);
        Friend f3 = new Friend(room);
        Friend f4 = new Friend(room);
        Friend f5 = new Friend(room);
        Friend f6 = new Friend(room);
        Friend f7 = new Friend(room);
        Doctor d2 = new Doctor(room);
        List<Thread> list = new LinkedList<>();
        list.add(d);
        list.add(f);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);
        list.add(f7);
        list.add(d2);
        for (Thread t: list){
            t.start();
        }
        boolean b = true;
        while (b){
            b = false;
            for (Thread t: list){
                b = b || t.isAlive();
            }
        }

    }

}
