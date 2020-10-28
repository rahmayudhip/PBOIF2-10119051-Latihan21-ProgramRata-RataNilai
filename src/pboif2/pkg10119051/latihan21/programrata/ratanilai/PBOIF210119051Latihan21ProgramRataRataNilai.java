/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan21.programrata.ratanilai;

import java.util.Scanner;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program untuk menaampilkan Rata-rata Nilai
 */
public class PBOIF210119051Latihan21ProgramRataRataNilai {
    public static double hitungRataRata(double jumlah, int n){
        double rata = jumlah/n;
        return rata;
    }
    
    public static void main(String[] args){
        
        int  n;
        double jumlah, nilai, rata;
         Scanner input = new Scanner (System.in);
         System.out.print("Masukan Banyaknya Mahasiswa: ");
         n =input.nextInt();
         jumlah = 0;
         for (int i=1; i<=n; i++){
             System.out.print("Nilai Mahasiswa ke-"+ i +" : ");
             nilai =input.nextInt();
             jumlah += nilai;
         }
         rata = jumlah / n;
         System.out.println("Maka, Rata-rata Nilainya adalah :" +hitungRataRata(jumlah,n));
         System.out.println("(developed by : Rahmayudhi)");
    }
    
}