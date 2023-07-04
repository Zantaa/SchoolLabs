import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        MyComparableClass obj1 = new MyComparableClass(1, "Object 1");
        MyComparableClass obj2 = new MyComparableClass(2, "Object 2");
        MyComparableClass obj3 = new MyComparableClass(3, "Object 3");

        PriorityQueue<MyComparableClass> priorityQueue = new PriorityQueue<MyComparableClass>();
        priorityQueue.add(obj1);
        priorityQueue.add(obj2);
        priorityQueue.add(obj3);


        while (!priorityQueue.isEmpty()){
            MyComparableClass removedObject = priorityQueue.poll();
            System.out.println("Object removed: " + removedObject);
        }
    }
}
