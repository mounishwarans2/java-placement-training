import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class VowelCase {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String result = "";

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch == 'a') {
                result = result + 'A';
            }
            else if (ch == 'A') {
                result = result + 'a';
            }
            else if (ch == 'e') {
                result = result + 'E';
            }
            else if (ch == 'E') {
                result = result + 'e';
            }
            else if (ch == 'i') {
                result = result + 'I';
            }
            else if (ch == 'I') {
                result = result + 'i';
            }
            else if (ch == 'o') {
                result = result + 'O';
            }
            else if (ch == 'O') {
                result = result + 'o';
            }
            else if (ch == 'u') {
                result = result + 'U';
            }
            else if (ch == 'U') {
                result = result + 'u';
            }
            else {
                result = result + ch;
            }
        }

        System.out.println(result);

        br.close();
    }
}
