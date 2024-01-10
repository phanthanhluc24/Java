package QLSV.BasicJava;

import java.util.Scanner;

public class Trung_Lap {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu: ");
        String chuoi=input.nextLine();
        System.out.print("Nhap ky tu can tim: ");
        char ky_tu=input.next().charAt(0);
        Trung_Lap trung_lap=new Trung_Lap();
        String ket_qua=trung_lap.Tim_ky_tu(chuoi, ky_tu);
        System.out.print(ket_qua);
        input.close();
    }
    private String Tim_ky_tu(String chuoi,char ky_tu){
        int so_luong=0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i)==ky_tu) {
                so_luong++;
            }
        }
        return "So luong ky tu "+ky_tu+" la: "+so_luong;
    }
}
