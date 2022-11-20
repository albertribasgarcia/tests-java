package Failstacker;

public class DemoPlayer {

    public static void main(String[] args) {
        Player p[] = new Player[10000];
        for (Player c: p){
            c = new Player();
            c.start();
        }
    }
}
