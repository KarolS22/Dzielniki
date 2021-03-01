package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz opcję, wpisz 1 lub 2");
        System.out.println("1.Pokaż wszystkie dzielniki dla podanej liczby");
        System.out.println("2.Pokaż wszystkie liczby dzielące się przez podaną liczbę z przedziału 1-1000000");   // zmniejszyłem przedział, aby program działał sprawniej
        int wybor;
        try {
            wybor = scan.nextInt();
            if (wybor > 2 || wybor < 1) {
                System.out.println("Podano niepoprawną liczbę");
                System.out.println("Spróbuj jeszcze raz:");
                main(null);
            }


            switch (wybor) {
                case 1:
                    System.out.println("Podaj liczbę");
                    int j = 0;
                    int liczba = scan.nextInt();
                    for (int i = 1; i <= liczba; i++) {
                        if (liczba % i == 0) {
                            j++;
                            System.out.println(j + ". " + i);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Podaj liczbę");
                    j = 0;
                    liczba = scan.nextInt();
                    for (int i = liczba; i <= 1000000; i++) {
                        if(i%liczba==0){
                            System.out.println(i);
                        }
                    }
                    break;
            }
        }
        catch(InputMismatchException e){
            System.err.println("Podano niepoprawną wartość");
            main(null);
        }

    }
}
