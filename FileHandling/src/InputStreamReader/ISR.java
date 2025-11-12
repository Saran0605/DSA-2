package InputStreamReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class ISR {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter some letters");
            int letters = isr.read();
            while(isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
//            isr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
