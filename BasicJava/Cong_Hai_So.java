package QLSV.BasicJava;

import java.util.Scanner;

public class Cong_Hai_So {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first=input.nextInt();
        input.nextLine();
        System.out.print("Enter second number: ");
        int second=input.nextInt();
        input.nextLine();
        input.close();
        Cong_Hai_So calculatuon = new Cong_Hai_So();
        int phep_tinh=calculatuon.menu();
        int ket_qua=calculatuon.Tinh_toan(first, second, phep_tinh);
        System.out.println("Ket qua cua phep tinh la: "+ket_qua);
    }
    public int menu(){
        Scanner input =new Scanner(System.in);
        System.out.print("""
                --- Welcome to calculation---
                1. Phep cong (+)
                2. Phep tru (-)
                3. Phep nhan (*)
                4. Phep chia (/)
                Vui long nhap phep tinh: 
                """);
       int phep_tinh=input.nextInt();
       input.nextLine();
       input.close();
       return phep_tinh;
    }

    public int Tinh_toan(int first,int second,int phep_tinh){
        int ket_qua=0;
        switch (phep_tinh) {
            case 1:
                ket_qua= first + second;
                break;
            case 2:
                ket_qua= first - second;
                break;
            case 3:
                ket_qua= first * second;
                break;
            case 4:
                ket_qua= first / second;
                break;
            default:
                break;
        }
        return ket_qua;
    }
}
