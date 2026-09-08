public class DisplayVowels {
    public static void main(String[] args) {

        String word = "welcome to java class";

        char[] characters = word.toCharArray();

        System.out.println("Vowels in the given word:");

        for (int i = 0; i < characters.length; i++) {

            if (characters[i] == 'a' ||
                characters[i] == 'e' ||
                characters[i] == 'i' ||
                characters[i] == 'o' ||
                characters[i] == 'u') {

                System.out.println(characters[i]);
            }
        }
    }
}
