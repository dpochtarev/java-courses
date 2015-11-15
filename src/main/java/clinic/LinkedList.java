package clinic;


public class LinkedList {
    private int length;
    private Node current;
    private Node first;

    LinkedList(){
        current = new Node();
        length = 0;
    }

    public void add(Object element) {
        current.setValue(element);
        current.setNext(current);
        current = new Node(current, null, null);
        length++;
    }
    public void add(Object element, int index) throws Exception {
        check(index);
        if (index==0) {
            add(element);
        } else {
            Node prev = getNode(index - 1);
            Node next = getNode(index);
            Node tmp = new Node(prev, element, next);
            prev.setNext(tmp);
            next.setPrev(tmp);
            length++;
        }
    }

    public Object get(int index) throws Exception {
        check(index);
        return getNode(index).getValue();
    }

    private Node getNode(int index) {
        Node temp = current;
        int i = length;
        while (index!=i) {
            temp=temp.getPrev();
            i--;
        }
        return temp;
    }

    public int getLength(){
        return this.length;
    }

    public void remove(int index) throws Exception {
        if (index!=0) {
            check(index);
            check(index + 1);
            getNode(index + 1).setPrev(getNode(index - 1));
            getNode(index).setNext(getNode(index + 1));
        } else {
            getNode(index+1).setPrev(null);
        }
        length--;
    }
    private void check(int index) throws Exception {
        if (index>length) throw new Exception("Index can't be more than list length");
        if (index<0) throw new Exception("Index can't be negative");
    }


    private class Node{
        private Node prev;
        private Node next;
        private Object value;

        Node(){
            this.prev = null;
            this.value = null;
            this.next = null;
        }

        Node (Node prev, Object value, Node next){
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
        private Object getValue() {
            return this.value;
        }
        private Node getPrev() {
            return this.prev;
        }
        private Node getNext()
        {
            return this.next;
        }
        private void setPrev(Node prev){
            this.prev = prev;
        }
        private void setValue(Object value){
            this.value = value;
        }
        private void setNext(Node next){
            this.next = next;
        }
    }
}
