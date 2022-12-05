//Задача 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
import java.util.*;

public class Seminar3Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(10));
        }
        System.out.println(numbers);

        int total = 0;
        int min = numbers.get(0);
        int max = numbers.get(0);

        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) < min) {
                min = numbers.get(j);
            } else if (numbers.get(j) > max) {
                max = numbers.get(j);
            }
            total += numbers.get(j);
        }
        int average = total / numbers.size();

        System.out.printf("Минимальное число списка = %d \n", min);
        System.out.printf("Максимальное число списка = %d \n", max);
        System.out.printf("Среднее арифметическое списка = %d \n", average);
    }
}
