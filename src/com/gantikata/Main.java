package com.gantikata;

import java.util.Scanner;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk mengganti kata dari sebuah kalimat
 */

public class Main {
    static Scanner scan = new Scanner(System.in);
    String kalimat, gantiKata, menjadiKata;

    private void masukkanKalimat(){
        System.out.print("Masukkan Kalimat : ");
        kalimat = scan.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scan.next();
        System.out.print("Menjadi Kata : ");
        menjadiKata = scan.next();
    }

    private String mengubahKalimat(){
        return kalimat.replaceAll(gantiKata,menjadiKata);
    }

    private void tampilKalimat(String hasil){
        System.out.println("\n===Hasil Formatting===");
        System.out.println("Kalimat Awal : ".concat(kalimat));
        System.out.println("Kalimat Baru : ".concat(hasil));
    }

    public static void main(String[] args) {
        Main data = new Main();
        data.masukkanKalimat();
        String hasil = data.mengubahKalimat();
        data.tampilKalimat(hasil);
    }
}
