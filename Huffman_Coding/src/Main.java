public class Main {
    public static void main(String[] args) throws Exception {
        String str = "abbccda";
        HuffmanCoder cdr = new HuffmanCoder(str);
        String cs = cdr.encode(str);
        System.out.println(cs);
        String dc = cdr.decode(cs);
        System.out.println(dc);

    }
}