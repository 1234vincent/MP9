public class BitTreeInteriorNode implements BitTreeNode {
    private BitTreeNode left;
    private BitTreeNode right;
    // Constructor
    public BitTreeInteriorNode() {
        this.left = null;
        this.right = null;
    }
    public BitTreeInteriorNode(BitTreeNode left, BitTreeNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public BitTreeNode getLeft() {
        return this.left;
    }
    @Override
    public BitTreeNode getRight() {
        return this.right;
    }
    @Override
    public void setLeft(BitTreeNode left) {
        this.left = left;
    }
    @Override
    public void setRight(BitTreeNode right) {
        this.right = right;
    }
    @Override
    public boolean isLeaf() {
       return false;
    }
}
