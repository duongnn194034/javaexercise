class BST { //Binary Search Tree
    private int value;
    BST leftChild;
    BST rightChild;

    public int getValue() {
        return this.value;
    }
    public BST

    public BST find(int key) { //return a BST with root value = key
        if(this.getValue() == null) return null;
        else if(this.getValue() == key) return this;
        else if(this.getValue() > key) return leftChild.find(key);
        else return rightChild.find(key);
    }
}