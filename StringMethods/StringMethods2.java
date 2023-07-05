package StringMethods;

public class StringMethods2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String[] words = string.split(" ");

        boolean isFirstWordLonger = true;
        int firstWordLength = words[0].length();

        for (int i = 0; i < words.length; i++) {
            System.out.println("Cлово" + (i + 1) + " = " + words[i] + ", Длина этого слова = " + words[i].length());

            if (i > 0 && words[i].length() > firstWordLength) {
                isFirstWordLonger = false;
            }
        }

        System.out.println("Первое слово длиннее остальных: " + isFirstWordLonger);
    }
}
