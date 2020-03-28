/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree binarySearchTree = new MyBinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(20);
        binarySearchTree.insert(30);
        binarySearchTree.insert(40);
        binarySearchTree.insert(50);

        System.out.println("Left chid of BST ");
        binarySearchTree.traverse();
        System.out.println("no. of parents not hving left child:");
        System.out.println(binarySearchTree.getCountRight());

    }
}
