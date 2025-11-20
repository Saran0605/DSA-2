import java.util.*;

public class HuffmanCoder {
    HashMap<Character,String> encoder;
    HashMap<String, Character> decoder;


    private class Node implements Comparable<Node>{
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost){
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }
        @Override
        public int compareTo(Node other){
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception{
        HashMap<Character,Integer> fmap = new HashMap<>();

        for(char ch : feeder.toCharArray()){
            fmap.put(ch,fmap.getOrDefault(ch,0)+1);
        }
        //min heap
        PriorityQueue<Node> minHeap = new PriorityQueue<>();

        Set<Map.Entry<Character,Integer>> entrySet = fmap.entrySet();

        for(Map.Entry<Character,Integer> entry : entrySet){
            Node node = new Node(entry.getKey(),entry.getValue());
            minHeap.add(node);
        }

        while(minHeap.size() != 1){
            Node first = minHeap.poll();
            Node second = minHeap.poll();

            Node newNode = new Node('\0',first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.add(newNode);
        }

        Node ft = minHeap.poll();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();
        this.initEncDec(ft, "");

    }

    private void initEncDec(Node node, String value){
        if(node==null){
            return;
        }
        if(node.left == null && node.right==null){
            this.encoder.put(node.data,value);
            this.decoder.put(value,node.data);
        }

        initEncDec(node.left,value+"0");
        initEncDec(node.right,value+"1");

    }

    public String encode(String source){
        String ans = "";

        for(int i=0;i<source.length();i++){
            ans = ans + encoder.get(source.charAt(i));
        }
        return ans;
    }

    public String decode(String dest){
        String key = "";
        String ans = "";
        for(int i=0;i<dest.length();i++){
            key = key + dest.charAt(i);
            if(decoder.containsKey(key)){
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }
}
