public class DisplayCharacters {
    public static void main(String[] args) {

        String word = "welcome to java";

        char[] characters = word.toCharArray();

        System.out.println("Characters of the given word:");

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }
    }
}
