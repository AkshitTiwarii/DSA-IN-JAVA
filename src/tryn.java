import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryn {
    public static void main(String[] args) throws IOException {
        int i = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        try   {

            int j = Integer.parseInt(br.readLine());
            int c = j/i;
        }
        finally {

            // finally block is used to close the resources after using them to prevent things going out of hand.
            br.close();
        }
    }
}
