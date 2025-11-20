public class Hashing {
    public static void main(String[] args) {

        // since its an object class it can call hashcode
        //will return a calculated integer for that string
        String name = "Saran";

        //if we use Integer class the integer will return same, why the unique number need an another unique number
        int code = name.hashCode();
        System.out.println(code);
    }
}
