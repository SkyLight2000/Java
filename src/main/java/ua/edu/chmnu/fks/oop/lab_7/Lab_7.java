package ua.edu.chmnu.fks.oop.lab_7;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Lab_7 {
    static public void main(String[] args) {
        int[] arr = { 5, 1, 8, -2, 0, 3, 10 };

        Sort sort = (int[] mas, int low, int high) -> {
            if(mas.length == 0){
                return;
            }
            if(low >= high){
                return;
            }

            int middle = low + (high - low) / 2;
            int opora = mas[middle];
            int i = low, j = high;
            while(i <= j){

                while(mas[i] < opora){
                    i++;
                }

                while(mas[j] > opora){
                    j--;
                }

                if(i <= j){
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                    i++;
                    j--;
                }
            }

            if(low < j){
                sort(mas, low, j);
            }

            if(high > i){
                sort(mas, i, high);
            }
        };


        System.out.println("Было");
        System.out.println(Arrays.toString(arr));

        int low = 0;
        int high = arr.length - 1;

        sort.sort(arr, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(arr));
    }


    /*public static class QuickSort implements Sort{
        @Override
        public void sort(int[] arr, int low, int high) {
            if(arr.length == 0){
                return;
            }
            if(low >= high){
                return;
            }

            int middle = low + (high - low) / 2;
            int opora = arr[middle];
            int i = low, j = high;
            while(i <= j){

                while(arr[i] < opora){
                    i++;
                }

                while(arr[j] > opora){
                    j--;
                }

                if(i <= j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            if(low < j){
                sort(arr, low, j);
            }

            if(high > i){
                sort(arr, i, high);
            }
        }
    }*/
}
