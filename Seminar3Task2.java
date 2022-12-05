//Задача 2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
import java.util.*;

public class Seminar3Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers.add(random.nextInt(10));
        }
        System.out.println(numbers);
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) % 2 == 0) {
                numbers.remove(j);
                j--;
            }
        }
        System.out.println(numbers);
    }
}
