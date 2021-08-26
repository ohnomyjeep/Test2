package com.max.idea;

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String name = "Вячеслав";
        String read_name = "";
        byte[] arr = new byte[50];
        int i = 0;
        try {
            int Char = System.in.read();
            while (System.in.available() > 0) {
                arr[i++] = (byte) Char;
                Char = System.in.read();
            }
            arr = Trim(arr, i);
            read_name = new String(arr);
        } catch (Exception err) {
        }
        if (name.compareTo(read_name) == 0)
            System.out.println("Привет, " + name);
        else
            System.out.println("Такого имени нет");
    }
    private static byte[] Trim(byte[] arr, int len) {
        byte[] tmp = new byte[len];
        for (int i = 0; i < len; i++)
            tmp[i] = arr[i];
        return tmp;
    }
}
