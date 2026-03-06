import java.io.*;

public class ReadSampleFile {
    public static void main(String[] args) {
        try {
            File file = new File("D:/sample.txt");   // path of file outside project
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Reading data from sample.txt:\n");

            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();
            fr.close();
        } 
        catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}