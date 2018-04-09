import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ch1 ch1 = new ch1(scn.next(), scn.next(), scn.nextFloat(), scn.nextFloat(), scn.nextFloat());
        ch2 ch2 = new ch2(scn.next(), scn.next(), scn.nextFloat(), scn.nextFloat(), scn.nextFloat());
        ch3 ch3 = new ch3(scn.next(), scn.next(), scn.nextFloat(), scn.nextFloat(), scn.nextFloat());
        ch4 ch4 = new ch4(scn.next(), scn.next(), scn.nextFloat(), scn.nextFloat(), scn.nextFloat());
        boolean x = true;
        while (x) { //輸出功能表
            System.out.println("------------------功能表-----------------");
            System.out.println("|              欲察看戰士資料請按1            |");
            System.out.println("|              欲察看坦克資料請按2            |");
            System.out.println("|              欲察看弓手資料請按3            |");
            System.out.println("|              欲察看補師資料請按4            |");
            System.out.println("|                結束請按5              |");
            System.out.println("-----------------------------------------");
            System.out.print("在這裡進行輸入->");
            int s = scn.nextInt();
            switch (s) {
                case 1:
                    ch1.showAll();
                    ch1.showeffectadd();
                    break;
                case 2:
                    ch2.showAll();
                    ch2.showeffectadd();
                    break;
                case 3:
                    ch3.showAll();
                    ch3.showeffectadd();
                    break;
                case 4:
                    ch4.showAll();
                    ch4.showeffectadd();
                    break;
                case 5:
                    x = false;
                    System.out.println("感謝您本次使用 歡迎下次使用");
                    break;
                default:
                    System.out.println("請輸入數字1~5");
                    x = false;
            }
        }
    }
}