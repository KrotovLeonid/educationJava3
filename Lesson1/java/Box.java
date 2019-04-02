import Fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

class Box<T extends Fruit> {
    private ArrayList<T> fruitList;

    public Box(T... arr){
        fruitList = new ArrayList<T>(Arrays.asList(arr));
    }

    public float getWeight(){
        if (fruitList.size() == 0) return 0;
        return fruitList.get(0).getWeight()*fruitList.size();
    }
    public void setFruit(T Fruit){
        fruitList.add(Fruit);
    }
    public void changeBox(Box<? super T> another){
        another.fruitList.addAll(this.fruitList);
        this.fruitList.clear();
    }
    public boolean compareBox(Box another){
        return this.getWeight() == another.getWeight();
    }


}
