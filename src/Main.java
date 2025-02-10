import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
/*        Book book = new Book("ddf", "sdf", 201);
        book.enterInformation();
        Book book1 = new Book("ddf", "sdf", 201);
        book1.enterInformation();
        System.out.println(book1.equals(book));
        String str = new Scanner(System.in).nextLine().toUpperCase();
        Month.JUNE.isWinter(str);
        Author author = new Author("asd", "Asd", 123);
        System.out.println(author.name + author.age);*/
        int targetSum = 5;
        int[] array2 = {0,1,2};
        int[] array1 = {2,1,0,4,5,9};
        int k = 3;
        String[] arr1 = {"g", "k", "l", "q"};
        String[] arr2 = { "l", "k", "g"};
       // check(arr1, arr2);
        System.out.println(sumMas(array1, k));
//        twoSum(array2,targetSum);
//        movingZeroToEnd(array2);
    }

    public static void twoSum(int[] nums, int targetSum) {
        int[] array = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - 1; j++){
                if(nums[i] + nums[j + 1] == targetSum) {
                    array[0] = nums[i];
                    array[1] = nums[j + 1];
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }

    /*Задача 2: Перестановка нулей в конец
Условие:
Напишите метод, который перемещает все нули в конец массива, сохраняя порядок
остальных элементов*/
    public static void movingZeroToEnd(int[] array){
        int[] mas = new int[array.length];
        int j = 0;
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] != 0){
                mas[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    /*Задача 3: Проверка на перестановку (анаграмма массива)
Условие:
Напишите метод, который проверяет, являются ли два массива перестановками друг друга (то
есть содержат одинаковые элементы в разном порядке).
*/

    public static void check(String[] arr1, String[] arr2){
        int i = 0;
        int j = arr1.length - 1;
        int count = 0;
        if(arr1.length == arr2.length) {
            while (i < arr1.length){
                if (!Objects.equals(arr1[i], arr2[j])) {
                    count++;
                    break;
                }
                j--;
                i++;
            }
        } else {
            count++;
        }
        if(count != 0) {
            System.out.println("not check");
        }
        else {
            System.out.println("check" + count);
        }
    }

    public static int sumMas(int[] array, int k) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        int sum = 0;
        for(int i = array.length - 1; i > 0; i--){
            sum += array[i];
            k--;
            if (k == 0) {
                break;
            }
        }
        return sum;
    }
}