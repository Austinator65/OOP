package Playround;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        String[] a = { "austin", "atiso", "Mph", "Keitumetse" };
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter index number: ");
        int index = scan.nextInt();
        scan.close();
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > index) {
                char b = a[i].charAt(index - 1);
                System.out.println(b);
            }
        }
    }
}
