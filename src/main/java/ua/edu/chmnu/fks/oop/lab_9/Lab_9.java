package ua.edu.chmnu.fks.oop.lab_9;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Lab_9 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Documents\\NetBeansProjects\\OOP-2k-master\\src\\main\\java\\ua\\edu\\chmnu\\fks\\oop\\lab_9\\franxx.txt");
        System.out.println(countWord(file));
    }
    public static Map<String, Integer> countWord(File file) throws IOException {
        int length = (int) file.length();

        Map<String, Integer> map = new HashMap<>();
        if (length != 0) {
            char[] chars = new char[length];
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

            int read = inputStreamReader.read(chars);

            String str = new String(chars, 0, read);
            str = str.trim();
            str = str.toLowerCase();
            str = str.replaceAll("\\W", " ");

            for(String s: str.split(" ")) {
                if(map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                }
                else {
                    map.put(s, 1);
                }
            }
            map.remove("");
        }
        return map;
    }
}
