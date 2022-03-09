
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
        return this.value;
    }
    public LinkedList getNext () {
        return this.next;
    }

    public void setValue (int value) {
        this.value = value;
    }

    public void setNext (LinkedList ll) {
        this.next = new LinkedList(ll);
    }
    
    public LinkedList push_front(int value) {
        LinkedList newLList = new LinkedList();
        newLList.setValue(value);
        newLList.setNext(this);
        return newLList;
    }

    public LinkedList push_back(int value) {

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
        while(newLL.value != value) {
            key++;
            newLL = new LinkedList(newll.getNext());
        }
        if(key == this.getLength()-1) return -1;
        else return key;
    }

    public remove(int val)
}