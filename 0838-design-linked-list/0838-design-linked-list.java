class MyLinkedList {

    public Node head, tail;
    public int len;

    public MyLinkedList() {

        len = 0;
    }

    public int get(int index) {
        if(len <= index){
            return -1;
        }

        if(index ==0){
            return head.data;
        }
        if(index==len-1){
            return tail.data;
        }
        Node temp = head;
        while(index>0){
            temp = temp.next;
            index--;
        }
        return temp.data;
    }

    public void addAtHead(int val) {

        Node new_node = new Node(val);
        if(len==0){
            head = new_node;
            tail = head;
            len++;
        }else{
            new_node.next = head;
            head = new_node;
            len++;
        }
    }

    public void addAtTail(int val) {
        Node new_node = new Node(val);
        if(len==0){
            head = new_node;
            tail = head;
            len++;
        }
        else{
            tail.next = new_node;
            tail = new_node;
            len++;
        }
    }

    public void addAtIndex(int index, int val) {

        Node new_node = new Node(val);
        if(index ==0){
            new_node.next = head;
            head = new_node;
            len++;
        }
        else if(len==index){
            tail.next = new_node;
            tail = new_node;
            len++;
        }
        else if(index<len){
            Node temp = head;
            Node prev = head;
            while(index>0){
                prev = temp;
                temp = temp.next;
                index--;
            }
            prev.next = new_node;
            new_node.next = temp;
            len++;
        }
    }

    public void deleteAtIndex(int index) {
        Node temp = head;
        Node prev = head;
        if(len>index){
            if (index == 0) {
                head = head.next;
            } else {
                Node current = head;
                for (int i = 0; i < index-1 ; i++) {
                    current = current.next;
                }
                if(current.next==tail){
                    tail = current;
                }
                current.next = current.next.next;

            }
            len--;
        }
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }

}