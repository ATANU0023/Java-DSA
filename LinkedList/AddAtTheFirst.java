// add node at the first position

public class AddAtTheFirst {
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int val){
            this.data = val;
            next = null;
        }
        
    }    

    public void addAtFirst(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
        
    }   
    public void printList(){
        Node temp= head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        AddAtTheFirst n1 = new AddAtTheFirst();
        n1.addAtFirst(20);
        n1.addAtFirst(80);
        n1.addAtFirst(10);
        n1.addAtFirst(40);
        n1.addAtFirst(30);

        System.out.println("Created linkedList:");
        n1.printList();
       
    }

    
}
