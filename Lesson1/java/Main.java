import Fruit.Apple;
import Fruit.Orange;

public class Main {

    public static void main(String[] args) {
        Box<Apple> box1= new Box();
        Box<Orange> box2 = new Box();
        Box box3 = new Box();
        Apple[] apples = {new Apple(), new Apple(),new Apple()};
        Orange[] oranges = {new Orange(), new Orange(), new Orange()};

        box1.setFruit(apples[0]);
        box1.setFruit(apples[1]);
        box1.setFruit(apples[2]);
        box2.setFruit(oranges[0]);
        box2.setFruit(oranges[1]);

        System.out.println("Вес первой коробки " + box1.getWeight());
        System.out.println("Вес второй коробк " + box2.getWeight());

        box2.changeBox(box3);
        System.out.println("Из второй коробки пересыпали в третью теперь коробка 3 весит " + box3.getWeight());
        System.out.println("Коробки  1 и 3 равны по весу: " + box1.compareBox(box3));
        System.out.println("Коробки  1 и 2 равны по весу: " + box1.compareBox(box2));


    }
}
