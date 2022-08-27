package DataStructure.LinkedList;

public class ListProblems {
    public static void main(String[] args) {
        int [] array = {1,2,3,5,5};
        ListNode head = new ListNode(array[0]);
        ListNode tail = head;
        for (int i = 0; i <array.length ; i++) {
            ListNode n = new ListNode(array[0]);
            tail.next = n;
            tail = n;
        }

    }
    public ListNode removeNthFromEnd(ListNode head, int n){
        int counter = 0;
        ListNode tail = head;
        for(ListNode l = head; l!=null; l=l.next){
            tail = l;
            counter++;
        }
        if(counter!=0 && n>0 && counter>n && tail!=null){
            int target = (counter) -(n);
            if (target==0 && n!=1){
                ListNode temp = head;
                head = head.next;
                temp.next = null;


            }
            else if (n==1) {
                for(ListNode ln = head; ln.next!=null; ln=ln.next){
                    tail = ln;
                }
                tail.next = null;
            }
            else {
                for (ListNode x = head; x!=null; x=x.next){
                    if (target==0){
                        ListNode temp = x.next;
                        ListNode connector = temp.next;
                        x.next = connector;
                        temp.next= null;
                    }
                    target--;
                }
            }


        }
        return head;
    }
}
