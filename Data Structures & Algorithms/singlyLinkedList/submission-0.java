class LinkedList {

    private static class Node{
        int val;
        Node next;

        Node(int val){
            this.val =val;
            this.next=null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public int get(int index) {

        
        if(index<0 || index >= size){
            return -1;
        }
                        
        Node current = head;

        for(int i=0;i<index;i++){
            current = current.next;
        }
        return current.val;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(size == 0){
            tail = newNode;
        }
        size++;
    }

    public void insertTail(int val) {
        
        Node newNode = new Node(val);

        if(size == 0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next = newNode;
            tail= newNode;
        }


        size++;
    }

    public boolean remove(int index) {
        if(index<0|| index>=size){
            return false;
        }

        if(index==0){
            head=head.next;
            if(size==1){
                tail=null;
            }
            size--;
            return true;
        }
        Node prev = head;
        for(int i=0; i<index-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;

        if(index==size-1){
            tail=prev;
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer>arr=new ArrayList<>();
        Node current = head;

        while(current!=null){
            arr.add(current.val);
            current = current.next;
        }

        return arr;
    }
}
