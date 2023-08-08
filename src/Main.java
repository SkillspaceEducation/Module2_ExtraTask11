import java.util.Arrays;
import java.util.Random;

/*
Найти максимальный из элементов массива с четным индексом
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mas = new int[10];
        int max = mas[0];
        int id = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(100);
        }
        System.out.println("Исходный массив " + Arrays.toString(mas));
        for (int i = 0; i < mas.length; i += 2) {
            if (mas[i] > max) {
                max = mas[i];
                id = i;
            }
        }
        System.out.printf("Максимальным элементом с четным индексом является число %d с индексом %d\n", max, id);
    }
}