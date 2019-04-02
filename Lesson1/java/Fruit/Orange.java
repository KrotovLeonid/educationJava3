package Fruit;

public class Orange extends Fruit {
    float weight = 1.5f;

    public Orange(){
    this.weight = weight;
    }

    @Override
    public float getWeight() { return weight; }
}
