import java.util.LinkedList;

public class Car {


    String model;

    public Car(String model) {
        this.model = model;
    }

    public static void main(String[] args) {


        // 1) Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод(не void), который вернет “перевернутый” список.

        LinkedList<Car> myCars = new LinkedList<>();
        Car VAZ2101 = new Car("VAZ2101");
        Car BMW = new Car("BMW M5");
        Car Ferrari = new Car("Ferrari Spider");
        Car Lamborghini = new Car("Lamborghini Diablo GTR");
        Car Bugatti = new Car("Bugatti Eid Mubarak");

        myCars.add(Ferrari);
        myCars.add(VAZ2101);
        myCars.add(Lamborghini);
        myCars.add(Bugatti);
        myCars.add(BMW);

        //System.out.println(myCars);
        // for (int i = myCars.size() - 1; i > 0; i--) {
            //System.out.println(myCars.get(i));
            //   }
        reverseList(myCars);
    }

    // Я пытался сделать эту задачу ещё одним способом но у меня почему то не получилось!
    // Может вы подскажете почему так происходит? Вот нижу код:
    //         for (int i = 0; i < myCars.size(); i++) {
    //            System.out.println(myCars.pollLast());
    //        }
    // В результате удаляет и выводит только 3 последних элемента, а первые 2 остаются незмеченными...
    // цикл их как-будто игнорирует или дойдя прерывается по непонятным причинам.
    @Override
    public String toString() {
        return model;
    }

    public static LinkedList <Car> reverseList(LinkedList<Car> name) {
        for (int i = name.size() - 1; i >= 0; i--) {
            System.out.println(name.get(i));
        }
        return name;
    }
}
