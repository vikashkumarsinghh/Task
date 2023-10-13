import java.util.Scanner;

class RomanToInteger {

    public static int value(char ch) {
        
        if (ch == 'I' || ch == 'i' )
            return 1;
        if (ch == 'V' || ch == 'v')
            return 5;
        if (ch == 'X' || ch == 'x')
            return 10;
        if (ch == 'L' || ch == 'l')
            return 50;
        if (ch == 'C' || ch == 'c')
            return 100;
        if (ch == 'D' || ch == 'd')
            return 500;
        if (ch == 'M' || ch == 'm')
            return 1000;
        return -1;
    }

    public static int romanToDecimal(String str) {
        int result = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int firstcharacter = value(str.charAt(i));
            if (i + 1 < n) {
                int secondcharacter = value(str.charAt(i + 1));
                if (firstcharacter >= secondcharacter) {
                    result = result + firstcharacter;
                } else {
                    result = result + secondcharacter - firstcharacter;
                    i++;
                }
            } else {
                result = result + firstcharacter;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roman number ");

        String str = sc.nextLine();
        int a = romanToDecimal(str);
        System.out.println(a);

        sc.close();

    }
}