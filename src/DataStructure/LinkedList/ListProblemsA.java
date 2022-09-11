package DataStructure.LinkedList;

public class ListProblemsA {
    public static void main(String[] args) {
        int a1 [] = {1,2,5};//[[1,4,5],[1,3,4],[2,6]]
        int a2 [] = {1,3,4};
        int a3 [] = {2,6};
        ListNode l1 = new ListNode(a1[0]);
        ListNode l1next = l1;
        ListNode l2 = new ListNode(a2[0]);
        ListNode l2next = l2;
        ListNode l3 = new ListNode(a3[0]);
        ListNode l3next = l3;
        l3.next = new ListNode(6);

        for (int i = 1; i <3 ; i++) {
            ListNode n1 = new ListNode(a1[i]);
            l1next.next = n1;
            l1next = n1;
            ListNode n2 = new ListNode(a2[i]);
            l2next.next = n2;
            l2next = n2;

        }
        ListNode [] mylist = new ListNode[3];
        mylist[0] = l1;
        mylist[1] = l2;
        mylist[2] = l3;
        ListNode lst = mergeKLists(mylist);
        for(ListNode l = lst; l!=null; l=l.next){
            System.out.print(l.val+" ");
        }


    }

    public static ListNode mergeKLists(ListNode [] lists ){
        ListNode head = null;
        if(lists[0]!=null){
            head = lists[0];
        }
        ListNode temphead;


        for (int i = 0; i < lists.length ; i++) {
            temphead = new ListNode();
            ListNode tail = null;
            Boolean flag = false;
            if(head!=null && lists[i]!=null){
                if(head.val<lists[i].val) {
                    temphead.val = head.val;
                    flag = true;
                }
                else{
                    temphead.val = lists[i].val;
                }
                tail = temphead;

                ListNode temp = lists[i];
                while (flag && temp!=null && head.next!=null){
                    if (temp.val < head.next.val){
                        tail.next = new ListNode(temp.val);
                    }
                    else {
                        tail.next = new ListNode(head.next.val);
                    }
                    tail = tail.next;
                    head = head.next;
                    temp = temp.next;
                }
                while (!flag && temp!=null && head.next!=null){
                    if (temp.next.val < head.val){
                        tail.next = new ListNode(temp.next.val);

                    }
                    else{
                        tail.next = new ListNode(head.val);
                    }
                    tail = tail.next;
                    head = head.next;
                    temp = temp.next;
                }
                while (head.next!=null){
                    tail.next = new ListNode(head.val);
                    tail = tail.next;
                    head = head.next;
                }
                while (temp!=null && temp.next!=null){
                    tail.next= new ListNode(temp.val);
                    tail = tail.next;
                    temp = temp.next;
                }
                head = temphead;
            }

        }
        return head;
    }
}
