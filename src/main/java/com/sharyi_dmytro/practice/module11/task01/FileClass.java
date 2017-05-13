package com.sharyi_dmytro.practice.module11.task01;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class FileClass {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();

        map.put("1", "yes");
        map.put("2", "no");
        map.put("3", "maybe");

        //System.out.println(map);


        try {
            System.out.println(replacer(map));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String replacer(Map<String, String> map) throws IOException {
        File file = new File("C:\\Users\\nonal\\IdeaProjects\\GoJavaHomework\\src\\main\\java\\com\\sharyi_dmytro\\practice\\module11\\task01\\text.txt");
        String str;
        String result = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((str = br.readLine()) != null) {
                System.out.println(str);

                for (String s : map.keySet()) {
                    str = str.replace(s, map.get(s));
                    //System.out.println("s = "+s);
                }
                result += str;
            }

        }

        return result;


    }
}
