package QLSV.BasicJava;
import java.util.Arrays;
import java.util.Scanner;

public class So_Chan_Le {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang: ");
        int quantity = input.nextInt();
        input.nextLine();
        // input.close();
        So_Chan_Le chan_le = new So_Chan_Le();
        int[] arr = chan_le.ListNumber(quantity);
        int[] list_chan = chan_le.Chan_Le(arr);
        input.close();
        System.out.printf("So chan la: " +Arrays.toString(list_chan) );
    }

    private int[] ListNumber(int quantity) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Nhan phan tu thu " + (i + 1) + " : ");
            int number = input.nextInt();
            input.nextLine();
            arr[i] = number;
        }
        input.close();
        return arr;
    }

    private int[] Chan_Le(int[] arr) {
        int chan = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                chan++;
            }
        }
        int[] arr_chan = new int[chan];
        int index_chan = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                arr_chan[index_chan++] = num;
            }
        }
        return arr_chan;
    }
}
