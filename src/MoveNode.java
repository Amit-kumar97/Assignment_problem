package LinkedLists;

/*
Move the last node to the front of a linked list
Given a linked list, move its last node to the front.

For example,
list {1, 2, 3, 4}
should be changed to {4, 1, 2, 3}
 */
class Node02
{
    int data;
    Node02 next;
    public Node02(int data,Node02 next)
    {
        this.data = data;
        this.next = null;
    }
}
public class MoveNode {

//    static Node02 head;
//    //---------Constructor
//    public MoveNode()
//    {
//        head = null;
//    }

    //-------------method to move the last node to the front of a given linked list
//    public static Node02 rearrange(Node02 head)
//    {
//        if(head==null || head.next==null)
//        {
//            return head;
//        }
//
//        Node02 temp = head;
//
//        //-------------move to the second last node
//        while (temp.next.next!=null)
//        {
//            temp = temp.next;
//        }
//
//        temp.next.next = head;                  //------------transform the list into a circular list
//        head = temp.next;
//        temp.next = null;                       //------------break the chain
//
//        return head;
//    }

    //-----------method to print a given linked list
    public static void print(Node02 head)
    {
        Node02 temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    //---------Recursive function to move the last node to the front of a given linked list
    public static Node02 rearrangerecursion(Node02 head, Node02 prev, Node02 curr)
    {
        //---------if the current node is the last
        if (curr.next == null)
        {
            //----------make its next point to the first node
            curr.next = head;

            //----------set its previous node to point to null
            prev.next = null;

            return curr;
        }

        return rearrangerecursion(head, curr, curr.next);
    }
    public static Node02 rearrange(Node02 head)
    {
        // if the list contains at least two nodes
        if (head != null && head.next != null)
        {
            head = rearrangerecursion(head, null, head);
        }

        return head;
    }

    public static void main(String[] args) {
        int ar[] = {1,2,3,4};

        Node02 head = null;
        for (int i = ar.length-1; i >= 0; i--) {
            head = new Node02(ar[i],head);
        }
        head = rearrange(head);
        print(head);
    }

}
