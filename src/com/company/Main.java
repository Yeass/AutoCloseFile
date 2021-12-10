package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int bajt;

        //wersja try zarzadzajaca zasobami
        //automatyczne zamkniecie pliku po zakonczeniu bolku try
        try(FileInputStream fis = new FileInputStream("C:\\Users\\patry\\Desktop\\plik.txt")){
            do{
                bajt = fis.read(); //wczytuje z pliku
                if (bajt != -1) System.out.println((char) bajt);
            }while (bajt != -1); //gdy rowna sie -1 dotarlismy do konca pliku
        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku o takiej nazwie!");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Blad wejscia-wyjscia!");
            e.printStackTrace();
        }
    }
}