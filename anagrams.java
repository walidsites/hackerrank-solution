import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
         a=a.toLowerCase();
         b=b.toLowerCase();
         int[] freq1 = new int[26];
         int[] freq2 = new int[26];

        for (int i = 0; i < a.length(); i++) {
            freq1[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            freq2[b.charAt(i) - 'a']++;
        }

        boolean same = true;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                same = false;
                break;
                
       
    }
}
         
         
         return same;
       
    }
    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
