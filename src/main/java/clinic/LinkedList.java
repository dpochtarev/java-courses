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
        if (length==0) {
            first = new Node(null, element, null);
            current.setPrev(first);
        } else {
            Node temp = current;
            temp.setValue(element);
            current = new Node();
            current.setPrev(temp);
        }
        length++;
    }

    public void add(Object element, int index) throws Exception {
        check(index);
        if (index==0) {
            if (length==0) add(element);
            else {
                changeFirst(element);
            }
        } else {
            if (index!=length) {
                Node temp = new Node(null, element, null);
                temp.setPrev(getNode(index-1));
                getNode(index).setPrev(temp);

            } else {
              add(element);
            }
            length++;
        }
    }

    public Object get(int index) throws Exception {
        check(index);
        return getNode(index).getValue();
    }

    public int getLength(){
        return this.length;
    }

    public void remove(int index) throws Exception {
        if (index!=0) {
            check(index);
            check(index + 1);
            getNode(index + 1).setPrev(getNode(index - 1));
        } else {
            changeFirst(first.getNext());
        }
        length--;
    }

    private Node getNode(int index) throws Exception {
        check(index);
        int i;
        if (index>length/2) {
            Node temp = current;
            i = length;
            while (index!=i) {
                temp=temp.getPrev();
                i--;
            }
            return temp;
        } else {
            Node temp = first;
            i = 0;
            while (index!=i) {
                temp = temp.getNext();
                i++;
            }
            return temp;
        }
    }

    private void changeFirst(Object element) {
        first = new Node(null, element, first);
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
        private void setPrev(Node node){
            this.prev = node;
            node.setNext(this);
        }
        private void setValue(Object value){
            this.value = value;
        }
        private void setNext(Node node){
            this.next = node;
        }
    }
}
