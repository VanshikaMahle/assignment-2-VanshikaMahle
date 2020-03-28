/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("vanshika", 10));
        queue.enqueue(new Student("kirti", 20));
        queue.enqueue(new Student("manya", 30));
        queue.enqueue(new Student("riyansh", 40));
        queue.enqueue(new Student("deepika", 50));
        queue.enqueue(new Student("divy", 60));

        queue.show();
        queue.dequeue();
        queue.show();
    }
}
