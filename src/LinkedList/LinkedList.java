package LinkedList;

public class LinkedList {

    Node head;
    void addAtLast(int n){
        if (head==null){
            Node newnode=new Node();
            newnode.data=n;
            newnode.next=null;
            head=newnode;
        }
        else{
            Node newnode=new Node();
            newnode.data=n;
            Node temp=head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void addAtFirst(int n){
        if (head==null){
            Node newnode=new Node();
            newnode.data=n;
            newnode.next=null;
            head=newnode;
        }
        else{
            Node newnode=new Node();
            newnode.data=n;
            newnode.next=head;
            head=newnode;
        }
    }
    void addAtIndex(int n,int index) {
        Node newnode = new Node();
        newnode.data = n;
        Node temp = head;
        int count = 0;
        if (index < 0 || head == null && index != 0) System.out.println("out of bound");
        else if (index == 0) addAtFirst(n);
        else {
            while (index - 1 != count) {
                temp = temp.next;
                count++;
            }
            if (count != index - 1) {
                System.out.println("out of bound");
            } else {
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
    }
    public void show(){
        Node temp=head;
        while(temp.next != null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public int MidIndex(){
        Node temp=head;
        int count = 0;
        while(temp.next != null){
            temp=temp.next;
            count++;
        }
        return count/2;
    }
    public void MidValue(){
        Node temp=head;
        int count = 0;
        int count2 = 0;
        while(temp.next != null){
            temp=temp.next;
            count++;
        }
         temp=head;
        while (count/2!=count2){
            temp=temp.next;
            count2++;
        }
        System.out.println(temp.data);
    }
    public void deleteLas() {
        if (head==null) System.out.println("The list is empty");
        else if (head.next==null) head=null;
        else{
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void deleteFirst(){
        if (head==null) System.out.println("The list is empty");
        else if (head.next==null) head=null;
        else{
            head=head.next;
        }
    }
    public void deleteAtPoint(int index){
        if (head==null) System.out.println("The list is empty");
        else if(index==0) deleteFirst();
        else {
            int count = 0;
            Node temp = head;
            while (index - 1 != count) {
                temp = temp.next;
                count++;
            }
            if (temp.next==null) System.out.println("out of bound");
            else temp.next = temp.next.next;
        }
    }
    public void sort(){
        Node p=head;
        Node q=p.next;
        Node end;
        int temp;
        for(end=null:end!+)
           if(p.data>q.data){
               temp=p.data;
               p.data=q.data;
               q.data=temp;
           }
        }
    }
}
