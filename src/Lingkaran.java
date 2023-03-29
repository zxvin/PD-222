import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lingkaran {
    public static void main(String[] args) throws IOException
    {
      //Inputan
      int r = 5;
      double luas;

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukkan Jari-Jari =");
        r = Integer.parseInt(br.readLine());

      //proses
        luas = 3.14*r*r;

      //Output
        System.out.println("Luas Lingkaran = " +luas);


    }
}
