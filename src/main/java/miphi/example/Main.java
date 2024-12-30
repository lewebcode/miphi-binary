package miphi.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример 1: Поиск в массиве целых чисел
        int[] intArray = {1, 3, 5, 7, 9};
        int intKey = 5;
        int intIndex = Arrays.binarySearch(intArray, intKey);
        System.out.println("Индекс ключа " + intKey + " в массиве intArray: " + intIndex);

        // Пример 2: Поиск с использованием компаратора в массиве строк
        String[] stringArray = {"apple", "banana", "cherry"};
        String stringKey = "banana";
        int stringIndex = Arrays.binarySearch(stringArray, stringKey, String::compareTo);
        System.out.println("Индекс ключа \"" + stringKey + "\" в массиве stringArray: " + stringIndex);

        // Пример 3: Поиск в списке с использованием Comparable
        List<String> stringList = new ArrayList<>(List.of("cat", "dog", "elephant"));
        Collections.sort(stringList);
        String listKey = "dog";
        int listIndex = Collections.binarySearch(stringList, listKey);
        System.out.println("Индекс ключа \"" + listKey + "\" в списке stringList: " + listIndex);

        // Пример 4: Поиск в списке с компаратором
        List<Integer> integerList = new ArrayList<>(List.of(10, 20, 30, 40));
        Collections.sort(integerList, Integer::compareTo);
        int listIntKey = 30;
        int listIntIndex = Collections.binarySearch(integerList, listIntKey, Integer::compareTo);
        System.out.println("Индекс ключа " + listIntKey + " в списке integerList: " + listIntIndex);
    }
}
