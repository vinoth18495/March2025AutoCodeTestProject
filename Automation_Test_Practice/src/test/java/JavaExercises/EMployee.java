package JavaExercises;

import java.util.Arrays;

public class EMployee {

    public static void main(String[] args) {
        String Str1 = "listener";
        String Str2 = "silencer";
        if (isAnagram(Str1, Str2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }

    static boolean isAnagram(String s1, String s2) {
        {
            s1 = s1.replaceAll("\\s", "").toLowerCase();
            s2 = s2.replaceAll("\\s", "").toLowerCase();
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        }
    }
}
