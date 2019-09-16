package main;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] ch = new char[str.length()];
        ch = str.toCharArray();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z'))
                str1 += ch[i];
            else
                str1 += "\n";
        }
        System.out.print(str1);
        s.close();
    }
}
