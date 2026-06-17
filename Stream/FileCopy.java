// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;

// public class FileCopy {
//     public static void main(String[] args) {
//         try {
//             FileInputStream fin = new FileInputStream("Input.txt");
//             FileOutputStream fout = new FileOutputStream("Output.txt");

//             int ch;
//             while ((ch = fin.read()) != -1) {
//                 fout.write(ch);
//             }

//             fin.close();
//             fout.close();

//             System.out.println("File copied successfully.");
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileReader fin = new FileReader("Input.txt");
            FileWriter fout = new FileWriter("Output.txt");

            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}