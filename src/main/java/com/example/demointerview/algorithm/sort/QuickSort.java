package com.example.demointerview.algorithm.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.stream.IntStream;

@Slf4j
public class QuickSort {
    static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partition = partition(arr, begin, end);
            quickSort(arr, begin, partition - 1);
            quickSort(arr, partition + 1, end);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = IntStream.generate(() -> random.nextInt(1000000000))
                .limit(1000000)
                .toArray();

        log.info("Arr size: {}", arr.length);
        quickSort(arr, 0, arr.length - 1);
    }
}
