import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaTwo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = System.out::println;
        numbers.forEach( method );
    }
}
