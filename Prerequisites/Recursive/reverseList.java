

public class reverseList 
{   
    class Node
    {
        int data;
        Node next;
    }
    private Node first = null;
    public Node reverse(Node head)
    {
        if(head.next == null || head == null)
        {
            return head;
        }
        Node newList = reverse(head.next);
        (head.next).next = head;
        head.next = null;
        return newList;


    }
    public void display(Node head)
    {
        Node tmp = head;
        while(tmp != null)
        {
            System.out.println("\t"+ tmp.data + "\t") ;   
            tmp = tmp.next;

        }
    }
    public void insert(int i)
    {
        Node oldlast = first;
        first = new Node();
        first.data = i;
        first.next = oldlast;
    }

    public static void main(String[] args)
    {
        reverseList s = new reverseList();
        s.insert(1);
        s.insert(4);
        s.insert(8);
        Node c = s.first;
        Node n = s.reverse(c);
        s.display(c);
        s.display(n);
        
    }

    
}
