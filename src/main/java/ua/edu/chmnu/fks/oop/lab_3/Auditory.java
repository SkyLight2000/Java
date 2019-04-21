package ua.edu.chmnu.fks.oop.lab_3;

public class Auditory {
    public static void main(String[] args) {
        int[] arr = {5, 7, 10, 2, 4, 3, 14};
        int temp;
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            int j = i - 1;
            while( j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.printf(" " + arr[i]);
        }
    }
}
