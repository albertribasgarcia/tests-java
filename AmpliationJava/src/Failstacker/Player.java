package Failstacker;

import java.util.Random;

public class Player extends Thread{
    Item Dandelion = new Item();
    int blackStones = 0;
    int concentratedBlackStones = 0;
    int memoryFragments = 0;
    int failStacks = 0;
    public Player(){

    }

    public void run(){
        while (Dandelion.level < 20){
            if (Dandelion.durability < 20){
                repairMax();
            }
            if (Dandelion.level < 16){
                upgradeNormal();
            }else{
                upgradeConcentrated();
            }
        }
        System.out.println(this.getName() +"->\t Dandelion subió a PEN:\t"+ blackStones + " Black Stones,\t"+ concentratedBlackStones + " Concentrated Black Stones,\t" + memoryFragments + " Memory Fragments,\t"+ Dandelion.failstackMin[Dandelion.level-1] + " failstacks a PEN");
    }

    public void repairMax(){
        memoryFragments += 100 - Dandelion.durability;
        Dandelion.durability = 100;
    }
    public void upgradeNormal(){
        double TRY = new Random().nextDouble();
        double chance = Dandelion.chart[Dandelion.level] + (Dandelion.upChance[Dandelion.level] * (failStacks+1));
        if (chance > Dandelion.maxChance[Dandelion.level]) chance = Dandelion.maxChance[Dandelion.level];
        if (TRY <= chance){
            Dandelion.level++;
            if (Dandelion.level != 20)failStacks = Dandelion.failstackMin[Dandelion.level];
        }else{
            Dandelion.durability -= 5;
            failStacks++;
        }
        blackStones++;
    }
    public void upgradeConcentrated(){
        double TRY = new Random().nextDouble();
        double chance = Dandelion.chart[Dandelion.level] + (Dandelion.upChance[Dandelion.level] * (failStacks+1));
        if (chance > Dandelion.maxChance[Dandelion.level]) chance = Dandelion.maxChance[Dandelion.level];
        if (TRY <= chance){
            Dandelion.level++;
            if (Dandelion.level != 20)failStacks = Dandelion.failstackMin[Dandelion.level];
        }else{
            if (Dandelion.level >= 17) {
                Dandelion.level--;
                Dandelion.failstackMin[Dandelion.level+1]+= Dandelion.level - 15 + 1;
            }else{
                failStacks += 2;
            }
            Dandelion.durability -= 10;
            //failStacks += Dandelion.level - 15 + 1;
        }
        concentratedBlackStones++;
    }
}
