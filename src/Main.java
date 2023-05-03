import java.util.Deque;
import java.util.LinkedList;

class Main
{
    public static void enqueue(LinkedList<Integer> value, int number) {
        value.add(number);
    }

    public static LinkedList<Integer> dequeue(LinkedList<Integer> value) {
        value.pollFirst();
        return value;
    }

    public static LinkedList<Integer> first(LinkedList<Integer> value) {

        value.getFirst();
        return value;
    }
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Добавили в LinkedList 3 элемента: " + "\n" + list);
        System.out.println("Пример работы метода enqueue: ");
        enqueue(list,4);
        System.out.println(list);
        System.out.println("Пример работы метода dequeue(): " + "\n" + dequeue(list));
        System.out.println("Пример работы метода first(): " + "\n" + first(list));
    }
}