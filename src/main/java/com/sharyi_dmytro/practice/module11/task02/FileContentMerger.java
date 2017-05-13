package com.sharyi_dmytro.practice.module11.task02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class FileContentMerger {

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();

        map.put("1", "yes");
        map.put("2", "no");
        map.put("3", "maybe");

        //System.out.println(map);


        try {
            System.out.println(fileContentReplacer(map));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String fileContentReplacer(Map<String, String> map) throws IOException {
        File file = new File("C:\\Users\\nonal\\IdeaProjects\\GoJavaHomework\\src\\main\\java\\com\\sharyi_dmytro\\practice\\module11\\task02\\text2.txt");
        String str;
        String result = " ";

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

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(result);

        }

        return result;


    }
}