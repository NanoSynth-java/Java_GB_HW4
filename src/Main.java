import java.util.LinkedList;

class Main
{
    public static void enqueue(LinkedList<Integer> value, int number) {
        value.add(number);
    }
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);;
        enqueue(list,4);
        System.out.println(list);
    }
}