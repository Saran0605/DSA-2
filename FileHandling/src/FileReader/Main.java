package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("note.txt")){
            //read letters one by one actually stores only unicode values not directly character
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }

            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // reading the character stream
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Byte to char stream then reading char stream

    }
}
