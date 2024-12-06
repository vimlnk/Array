package app;

import java.util.Random;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // a. Створення масиву та заповнення випадковими числами
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Числа від 0 до 99
        }

        System.out.println("Оригінальний масив: " + Arrays.toString(array));

        // b. Сортування масиву методом злиття
        ArrayUtils.mergeSort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        // c. Бінарний пошук значення
        int target = array[new Random().nextInt(array.length)]; // Обираємо випадкове значення з масиву
        System.out.println("Шукаємо значення: " + target);

        int result = ArrayUtils.binarySearch(array, target);
        if (result != -1) {
            System.out.println("Значення " + target + " знайдено на індексі: " + result);
        } else {
            System.out.println("Значення " + target + " не знайдено.");
        }
    }
}