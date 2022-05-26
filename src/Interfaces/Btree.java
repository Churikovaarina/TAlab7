package Interfaces;

import Btree.BTree;
public interface Btree {
    BTree.BNode search(int key);
    void insert(int key);
    void delete(int key);
}
