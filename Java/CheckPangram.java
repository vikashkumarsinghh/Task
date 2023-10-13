import java.util.Scanner;

public class CheckPangram {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string ");
        String str = sc.nextLine();
        
        // String str = "The quick brown fox jumps over the lazy dog";

        boolean[] List = new boolean[26];
        
        int index = 0;
        int flag = 1;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';

            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            List[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (List[i] == false)
                flag = 0;
        }

        if (flag == 1)
            System.out.print("String is a pangram ");
        else
            System.out.print("String is not a pangram ");

        
        sc.close();
       
    }
}