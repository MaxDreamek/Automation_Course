package lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    static Queue<Integer> myQueue = new LinkedList<>();

    public static void main(String[] args) {
        addMethod(myQueue);
       // offerExample(myQueue, 34);
        elementExample(myQueue);

    }


    static void addMethod(Queue<Integer> queue) {
        queue.add(3);
        queue.add(6);
        queue.add(34);
        queue.add(23);
        queue.add(76);
    }

    static void showQueue(Queue<Integer> queue) {
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
    }

    // удаляет верхний элемент и в случае пустого листа не выбрасывает Exception
    static void pollExample(Queue<Integer> queue) {
        System.out.println("Before deleting with poll method");
        showQueue(myQueue);
        queue.poll();

        System.out.println('\n' + "After deleting with poll method ");
        showQueue(queue);
    }

    static void removeExample(Queue<Integer> queue) {
        System.out.println("Before remove with poll method");
        showQueue(myQueue);
        queue.remove();

        System.out.println('\n' + "After remove with poll method ");
        showQueue(queue);
    }
    static void removeByObject(Queue<Integer> queue, int obj) {
        System.out.println("Before remove by object");
        showQueue(myQueue);
        queue.remove(obj);

        System.out.println('\n' + "After remove by object");
        showQueue(queue);
    }
    static void offerExample(Queue<Integer> queue, int obj) {
        System.out.println("Before using offer method");
        showQueue(myQueue);
        queue.offer(obj);

        System.out.println('\n' + "After using offer method");
        showQueue(queue);
    }
    // вернет верхний элемент и в случае пустого листа НЕ выбрасывает Exception
    static void peekExample(Queue<Integer> queue) {
        System.out.println(queue.peek());
        showQueue(queue);
    }
    static void elementExample(Queue<Integer> queue) {
        System.out.println(queue.element());
        showQueue(queue);
    }
}

