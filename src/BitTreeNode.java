public interface BitTreeNode {
    // Methods to get children nodes
    default BitTreeNode getLeft() {
        throw new UnsupportedOperationException("This node does not support children.");
    }
    // we set default since bittreeleaf don't have to overide this method
    default BitTreeNode getRight() {
        throw new UnsupportedOperationException("This node does not support children.");
    }
    
    // Methods to set children nodes
    default void setLeft(BitTreeNode left) {
        throw new UnsupportedOperationException("This node does not support children.");
    }

    default void setRight(BitTreeNode right) {
        throw new UnsupportedOperationException("This node does not support children.");
    }
        
    // Method to determine if the node is a leaf
    boolean isLeaf();
}
