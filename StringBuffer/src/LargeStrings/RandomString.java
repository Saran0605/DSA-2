package LargeStrings;

import java.util.Random;

public class RandomString {
    static String generate(int size){
        // so using a buffer we can update same instead of creating new objects again and again
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();

        for(int i=0;i<size;i++){
            int rand = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)rand);

        }
        return sb.toString();
    }
}
