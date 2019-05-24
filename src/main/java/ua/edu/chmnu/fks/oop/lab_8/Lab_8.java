package ua.edu.chmnu.fks.oop.lab_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab_8 {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("ааафвц", "аыфаа", "вввуаф");
        System.out.println(maxConsonants(list));
    }

    public static char[] consonants = new char[]{'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};

    public static int consonants(String s){
        int counter = 0;
        char[] charArray = s.toCharArray();
        for (char ch : charArray) {
            for (char ch2 : consonants) {
                if (ch == ch2){
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    static List<String> maxConsonants(List<String> list){
        return list.stream()
                .filter(c -> consonants(c) > 3)
                .collect(Collectors.toList());
    }
}
