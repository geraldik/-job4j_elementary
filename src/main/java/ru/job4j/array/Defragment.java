package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int nullindex = 0;
        int notNullIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] == null) {
                    nullindex = j;
                    break;
                }
            }
            for (int j = i; j < array.length; j++) {
                if (array[j] != null) {
                    notNullIndex = j;
                    break;
                }
            }
        if (notNullIndex > nullindex) {
            array[nullindex] = array[notNullIndex];
            array[notNullIndex] = null;
        }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}