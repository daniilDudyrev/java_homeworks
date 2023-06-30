package homework10.homework10_3;

public class StringProcessor {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiou";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.contains(String.valueOf(ch))) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String str) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyz";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (consonants.contains(String.valueOf(ch))) {
                count++;
            }
        }
        return count;
    }

    public static int countWordOccurrences(String str, String word) {
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = str.indexOf(word, index);
            if (index != -1) {
                count++;
                index += word.length();
            }
        }
        return count;
    }
}