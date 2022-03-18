
public class LinkedList {
    private int value;
    private LinkedList next;

    public LinkedList() {

    }
    public LinkedList(int value) {
        this.value = value;
    }
    public LinkedList(LinkedList ll) {
        this.value = ll.getValue();
        this.LinkedList = ll.getNext();
    }
    
    public int getValue() {
        return value;
    }
    public LinkedList getNext () {
        return new LinkedList(next);
    }

    public void setValue (int value) {
        this.value = value;
    }

    public void setNext (LinkedList list) {
        this.next = new LinkedList(list);
    }
    
    public LinkedList push_front(int value) {
        LinkedList newLList = new LinkedList();
        newLList.setValue(value);
        newLList.setNext(this);
        return new LinkedList(newLList);
    }

    public LinkedList push_back(int value) {
        LinkedList list = new LinkedList(this);
        while(list.getValue() != null)
            list = list.getNext();
        list.setValue(value);
        return this;
    }

    public getLength() {
        LinkedList newLL  = new LinkedList(this);
        int length = 0;
        while(newLL.value != null) {
            length++;
            newLL = new LinkedList(newll.getNext());
        }
        return length;
    }

    public int find(int value) {
        LinkedList newLL = new LinkedList(this);
        newLL.push_back(value);
        int key = -1;
        while(newLL.getValue() != value) {
            key++;
            newLL = new LinkedList(newll.getNext());
        }
        if(key == this.getLength()-1) return -1;
        else return key;
    }

    public LinkedList remove(int value) {
        LinkedList list = new LinkedList(this);
        if(list.find(value) == -1) return this;
        if(list.getValue() = val) return list.getNext();
        while(list.getNext().getValue() == value)
            list = list.getNext();
        list.setNext(list.getNext().getNext());
        return this;
    }
}
