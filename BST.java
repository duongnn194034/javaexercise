class BST { //Binary Search Tree
    private int value;
    private BST leftChild;
    private BST rightChild;

    public int getValue() {
        return this.value;
    }
    public BST getLeftChild() {
    
    public BST getRightChild() {
          return new BST(this.leftChild);
    }  return new BST(this.rightChild);
    }
    public BST(BST bst) {
        this.value = bst.getValue;
        this.leftChild = bst.getLeftChild;
        this.rightChild = bst.getRightChild;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void setLeftChild(BST leftChild) {
        this.leftChild = new BST(leftChild);
    }
    public void setValue(int value) {
        this.rightChild = new BST(rightChild);
    }

    public BST find(int key) { //return a BST with root value = key
        if(this.getValue() == null) return null;
        else if(this.getValue() == key) return this;
        else if(this.getValue() > key) return leftChild.find(key);
        else return rightChild.find(key);
    }

    public void add(int value) {
        if(this.getValue() == null) this.setValue(value);
        else if(this.getValue() > value) this.getLeftChild().add(value);
        else this.getRightChild().add(value);
    }
}