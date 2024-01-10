package QLSV.BasicJava;

import java.util.Arrays;
import java.util.Scanner;

public class XapXep {
    public static void main(String[] args){
        XapXep xapxep=new XapXep();
        Scanner input =new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Moi ban chon so de thuc hien
                    1. Xap xep theo ten
                    2. Tim phan thu nho thu 2
                    Vui long chon so: 
                    """);
            int option=input.nextInt();
            switch (option) {
                case 1:
                    char[] result= xapxep.Xap_xep_ten();
                    System.out.println("Xap xep theo ten la: "+Arrays.toString(result));
                    input.nextLine();
                    break;
                case 2:
                    int [] results=xapxep.Phan_tu_nho_thu_hai();
                    System.out.println("Phan tu nho thu 2 la: "+results[1]);
                    input.nextLine();
                    break;
                default:
                    break;
            }
        }
    }

    private char[] Xap_xep_ten(){
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap ho va ten cua ban: ");
        String ten=input.nextLine();
        String name=ten.replaceAll(" ","");
        char[] array=new char[name.length()];
        input.close();
        for (int i = 0; i < name.length(); i++) {
            array[i]=name.charAt(i);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    char temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        return array;
    }

    private int[] Phan_tu_nho_thu_hai(){
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int element=input.nextInt();
        input.nextLine();
        int array[]=new int[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Nhap so phan tu thu "+(i+1)+": ");
            int number=input.nextInt();
            input.nextLine();
            array[i]=number;
        }
        input.close();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]) {
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        return array;
    }
}
