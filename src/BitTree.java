import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BitTree {
    private BitTreeNode root;
    private int size;
    /* constructor */
    public BitTree(int n) {
        this.root = null;
        this.size = n;
    }
    /* Implement a set function that takes a String of bits and Value, put them in the tree created */
    public void set(String bits, String value){
        if (bits.length()!= this.size|| !bits.matches("[01]+")){
            throw new IllegalArgumentException("The length of the bits string must be equal to the size of the tree.");
        }
        BitTreeNode current = this.root;
        for (int i=0; i<bits.length(); i++){
            char currentBit = bits.charAt(i);
            if (currentBit == '0'){
                if (current.getLeft() == null){
                    current.setLeft(new BitTreeInteriorNode());
                }
                current = current.getLeft();
            } else if (currentBit == '1'){
                if (current.getRight() == null){
                    current.setRight(new BitTreeInteriorNode());
                }
                current = current.getRight();
            }
        }
        if (!current.isLeaf()){
            current = new BitTreeLeaf(value);
        }else {
            ((BitTreeLeaf) current).setValue(value);
        }
    }
    /* Implement a get function that takes a String of bits and returns the value associated with the bits */
    public String get(String bits){
        if (bits.length()!= this.size|| !bits.matches("[01]+")){
            throw new IllegalArgumentException("The length of the bits string must be equal to the size of the tree.");
        }
        BitTreeNode current = this.root;
        for (int i=0; i<bits.length(); i++){
            char currentbit = bits.charAt(i);
            current = (currentbit == '0') ? current.getLeft() : current.getRight();
            if(current==null)
            throw new IllegalArgumentException("the node is null");
        }
        if (current instanceof BitTreeLeaf){
            return ((BitTreeLeaf)current).getValue();
        } else{
            throw new IllegalArgumentException("no value for the last bit");
        }
    }
   /* Implement a dump function that takes a PrintWriter and writes the bit patterns and values to the PrintWriter in CSV format */
    private void dumpNode(BitTreeNode node, StringBuilder path, PrintWriter pen) {
        if (node == null) return; // Base case: reached beyond leaf

        if (node instanceof BitTreeLeaf) {
            // At a leaf node, write the bit pattern and the character to CSV
            String bits = path.toString();
            String character = ((BitTreeLeaf) node).getValue();
            pen.println(bits + "," + character);
        }

        // Recursive case: traverse left and right subtrees
        if (node.getLeft() != null) {
            path.append('0');
            dumpNode(node.getLeft(), path, pen);
            path.deleteCharAt(path.length() - 1); // Remove last character after recursion
        }
        if (node.getRight() != null) {
            path.append('1');
            dumpNode(node.getRight(), path, pen);
            path.deleteCharAt(path.length() - 1); // Remove last character after recursion
        }
    }
  
    public void dump(PrintWriter pen) {
        dumpNode(root, new StringBuilder(), pen);
    }

/* Implement a load function that takes an InputStream and reads the bit patterns and values from the InputStream in CSV format */
    public void load(InputStream source) throws IOException{
        try(Scanner scanner = new Scanner(source)){
            while(scanner.hasNext()){
            String newline = scanner.nextLine();
            String[] parts = newline.split(",");
            if(parts.length != 2){
                throw new IllegalArgumentException("Invalid line in input");
            }
            String bits = parts[0];
            String value = parts[1];
            set(bits, value);
        }
        }
    }
}