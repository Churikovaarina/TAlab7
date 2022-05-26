package Filler;

import Btree.BTree;


import java.util.Random;

public class Filler {
    Random rand = new Random();
    public BTree fillWithRandomNumbers(BTree tree){
        for (int i = 0; i < 2000; i++) {
            int int_random = rand.nextInt(100);
            tree.insert(int_random);
        }
        return tree;
    }

    public BTree fillWithConsecutiveNumbers(BTree tree){
        for (int i = 0; i < 2000; i++) {
            tree.insert(i);
        }
        return tree;
    }
}
