public class BitTreeLeaf implements BitTreeNode{
    private String value; 
    // Constructor
    public BitTreeLeaf(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public boolean isLeaf() {
        return true;
    }
    
}
