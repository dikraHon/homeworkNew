import java.util.Random;

public class Main {
    public static void main(String[] args) {
    }
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
положительными, *сохраняя порядок внутри каждой группы.
 Пример:
 Вход: [4, -3, 2, -1, 0, -5].
 Выход: [-3, -1, -5, 4, 2, 0].
    */

    public static void sortArray(int[] mas){

    }
}