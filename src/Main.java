import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter size Array: ");
        sortArray(createMassive(new Scanner(System.in).nextInt()));
    }

    // создание случайного массива от -5 до 5
    public static int[] createMassive(int sizeMas){
        int[] mas = new int[sizeMas];
        int i = 0;
        while (i < sizeMas){
            mas[i] = new Random().nextInt(-5,5);
            ++i;
        }
        return mas;
    }

    /*
     Задание 1: Сортировка массива с отрицательными числами:
     Отсортируйте массив, чтобы отрицательные числа находились перед
     положительными.
    */
    // Сортировка по возрастанию
    public static void sortArray(int[] mas){
        System.out.println("not sorted array: " + Arrays.toString(mas));
        for(int i = 0; i < mas.length - 1; i++){
            for(int j = 0; j < mas.length - 1 - i; j++){
                if(mas[j] > mas[j + 1]){
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(mas));
    }


}