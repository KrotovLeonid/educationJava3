import java.util.ArrayList;

public class Arrays<T> {

    public static void changeElement(Object[] arr, int x, int y){// меняем элементы массива местами
        int test = x;
        x = y;
        y = test;
    }
    public static <T> ArrayList <T> convert(T[] arr){ // массив в лист
        return new ArrayList<T>(java.util.Arrays.asList(arr));
    }

}
