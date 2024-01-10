package QLSV.BasicJava;

import java.util.Scanner;

public class ATM_Rut_Tien {
    public static void main(String[] args){
        ATM_Rut_Tien bank=new ATM_Rut_Tien();
        float balance=0;
        while (true) {
            Scanner input=new Scanner(System.in);
            System.out.println("""
                    Chao Mung Ban Den Voi Ngan Hang Cua Chung Toi
                    -------- Vui Long Chon So De Thuc Hien ------
                    1. Rut Tien
                    2. Nap Tien
                        ---------- Moi Ban Nhap So ------------
                    """);
            int option=input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Nhap so tien can rut: ");
                    float money = input.nextFloat();
                    balance= bank.Rut_tien(money, balance);
                    System.out.println("So du cua ban la: "+balance);
                    break;
                case 2:
                    System.out.print("Nhap so tien can nap: ");
                    money = input.nextFloat();
                    balance= bank.Nap_tien(money, balance);
                    System.out.println("So du cua ban la: "+balance);
                    break;
                default:
                    break;
            }
            // input.close();
        }
    } 
    private float Rut_tien(float money,float balance){
        float check=0;
        if (balance<=0) {
            return 0;
        }else{
            check=balance-money;
            if (check<0) {
                return 0;
            }else{
                return check;
            }
        }
    }

    private float Nap_tien(float money,float balance){
        float check=0;
        check=balance+money;
        return check;
    }
}
