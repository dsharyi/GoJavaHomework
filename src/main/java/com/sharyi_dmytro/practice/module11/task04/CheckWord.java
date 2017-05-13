package com.sharyi_dmytro.practice.module11.task04;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nonal on 13.05.2017.
 */
public class CheckWord {
    public static void main(String[] args) throws IOException {
        String word = "Hello";
        System.out.println("Слово " + word + " появляется в файлe " + checkWordTryWithResourses(word) + " раз(а). Использование метода c try-with-resources");

        System.out.println("Слово " + word + " появляется в файлe " + checkWord(word) + " раз(а). Использование метода c try");


    }

    public static int checkWordTryWithResourses(String word) throws IOException {
        File file = new File("C:\\Users\\nonal\\IdeaProjects\\GoJavaHomework\\src\\main\\java\\com\\sharyi_dmytro\\practice\\module11\\task04\\text4.txt");
        String str;
        int result = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((str = br.readLine()) != null) {
                String[] split = str.split(" ");
                for (String s : split
                        ) {
                    if (s.contains(word)) {
                        result++;
                    }

                }


            }


            return result;


        }
    }

    public static int checkWord(String word) throws IOException {
        File file = new File("C:\\Users\\nonal\\IdeaProjects\\GoJavaHomework\\src\\main\\java\\com\\sharyi_dmytro\\practice\\module11\\task04\\text4.txt");
        String str;
        int result = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((str = br.readLine()) != null) {
                String[] split = str.split(" ");
                for (String s : split
                        ) {
                    if (s.contains(word)) {
                        result++;
                    }

                }


            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
