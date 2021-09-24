import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[]arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length-1-i]=arr[i];
        }
        return arr2;
    }
    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max = arr[0];
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=max && arr[i]>second ){
                second = arr[i];}
            }

return second;
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the", "of", "and", "a", "to", "in", "is", "you", "that", "it", "he", "was", "for", "on", "are", "as", "with", "his", "they", "I", "at", "be", "this", "have", "from", "or", "one", "had", "by", "word", "but", "not", "what", "all", "were", "we", "when", "your", "can", "said", "there", "use", "an", "each", "which", "she", "do", "how", "their", "if", "will", "up", "other", "about", "out", "many", "then", "them", "these", "so", "some", "her", "would", "make", "like", "him", "into", "time", "has", "look", "two", "more", "write", "go", "see", "number", "no", "way", "could", "people", "my", "than", "first", "water", "been", "call", "who", "oil", "its", "now", "find", "long", "down", "day", "did", "get", "come", "made", "may", "cat", "dog", "cats", "dogs"};
        for (String x: dictionary) {
            if (x.equals(word)){
                return true;}}



        return false;
    }
    public static void main(String[] args) {
        int[] arr = reverse(new int[] {3, 6, 3});
        System.out.println(Arrays.toString(arr));

int z = secondLargest(new int[] {3, 6, 0, 1, 19, 20});
System.out.println(z);

        System.out.println(spellCheck("the"));
        System.out.println(spellCheck("a"));
        System.out.println(spellCheck("asdf"));
        System.out.println(spellCheck("it"));
    }
}
