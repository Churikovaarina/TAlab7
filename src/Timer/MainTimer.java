package Timer;

import Btree.BTree;
import Filler.Filler;

public class MainTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Filler filler = new Filler();

        //B-tree
        BTree bTree1 = new BTree(3);
        BTree bTree2 = new BTree(3);
        BTree bTreeFilledRandom = new BTree(3);
        BTree bTreeFilledConsecutive = new BTree(3);
        filler.fillWithRandomNumbers(bTreeFilledRandom);
        filler.fillWithConsecutiveNumbers(bTreeFilledConsecutive);
        System.out.println("BTree: ");
        System.out.println("filling with random numbers: " + timer.timer(Timer.FILLING_RANDOM, bTree1) + " ns");
        System.out.println("filling with consecutive numbers: " + timer.timer(Timer.FILLING_CONSECUTIVE, bTree2) + " ns");
        System.out.println("balancing in tree with random numbers: " + "0 ns (already balanced while inserting)");
        System.out.println("balancing in tree with consecutive numbers: " + "0 ns (already balanced while inserting)");
        System.out.println("searching: " + timer.timer(Timer.SEARCHING, bTreeFilledRandom) + " ns");
        System.out.println("deletion: " + timer.timer(Timer.DELETION, bTreeFilledRandom) + " ns\n");
    }
}
