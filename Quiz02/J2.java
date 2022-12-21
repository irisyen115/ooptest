import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class J2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./txt/rand.txt");
        BufferedWriter bfw = new BufferedWriter(fw);

        for (int i = 0; i < 1000; i++) {
            String r = String.valueOf((int) (Math.random() * 100000) + 1);
            bfw.write(r);
            bfw.newLine();
        }

        bfw.flush();
        fw.close();

    }
}
