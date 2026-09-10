import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class ReverseWords {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence: ");
        String sentence = br.readLine();

        StringTokenizer st = new StringTokenizer(sentence);
        StringBuilder result = new StringBuilder();

        while (st.hasMoreTokens()) {

            String word = st.nextToken();
            StringBuilder reverse = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse.append(word.charAt(i));
            }

            result.append(reverse);
            result.append(" ");
        }

        System.out.println("Reversed sentence: " + result);

        br.close();
    }
}
