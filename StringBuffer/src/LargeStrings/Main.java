package LargeStrings;

import static LargeStrings.RandomString.generate;

public class Main {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer buffer = new StringBuffer();

        // constructor 2
        StringBuffer buffer2 = new StringBuffer("Saran Soundharajan");

        // constructor 3
        StringBuffer buffer3 = new StringBuffer(30);

        buffer.append("Saran");
        buffer.append(" is studying");

//        buffer.insert(2, " inc ");
        buffer.replace(1,5, " hi ");

        buffer.delete(2,6);

        buffer.reverse();

//        System.out.println(buffer3.capacity());

        String str = buffer.toString();
//        System.out.println(str);


        int n = 2;
        String name = generate(n);
        System.out.println(name);



    }
}
