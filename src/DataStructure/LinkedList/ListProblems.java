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

    // Merge sorted lists
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode tail1 = list1;
        ListNode tail2 = list2;
        boolean flag  =false;
        ListNode head = new ListNode();
        ListNode tail = head;
        if(list1!=null && list2!=null){
            if(list1.next==null && list2.next ==null){
                if(list1.val<list2.val){
                    head = new ListNode(list1.val);
                    head.next = new ListNode(list2.val);
                }
                else{
                    head = new ListNode(list2.val);
                    head.next = new ListNode(list1.val);
                }
                return head ;
            }
            if(list1.val<list2.val){
                head.val = list1.val;
                flag = true;
            }
            else {
                head.val = list2.val;
            }
            // list1 first value is the head;
            if(flag && list1.next!=null && list2!=null){
                tail1 = tail1.next;
                while(tail1 !=null && tail2!=null){
                    if(tail1.val<tail2.val){
                        tail.next = new ListNode(tail1.val);
                        tail = tail.next;
                        tail1 = tail1.next;
                    }
                    else{
                        tail.next = new ListNode(tail2.val);
                        tail = tail.next;
                        tail2 = tail2.next;
                    }

                }
            }
            // list2 first value is the head ;
            else if (list1!=null && list2.next!=null){
                tail2 = tail2.next;
                while(tail1 !=null && tail2!=null){
                    if(tail1.val<tail2.val){
                        tail.next = new ListNode(tail1.val);
                        tail = tail.next;
                        tail1 = tail1.next;
                    }
                    else{
                        tail.next = new ListNode(tail2.val);
                        tail = tail.next;
                        tail2 = tail2.next;
                    }

                }

            }
            else if (tail1 != null && tail2.next==null){
                while(tail1!=null){
                    if(tail1.val<tail2.val){
                        tail.next = new ListNode(tail1.val);
                        tail = tail.next;
                        tail1 = tail1.next;
                    }
                    else{
                        tail.next = tail1;
                        break;
                    }
                }
                return head;

            }
            else if(tail2 != null && tail1.next == null ){
                while(tail2 != null && tail1.next == null){
                    if(tail1.val<tail2.val){
                        tail.next = tail2;
                        break;

                    }
                    else{
                        tail.next = new ListNode(tail2.val);
                        tail = tail.next;
                        tail2 = tail2.next;

                    }
                }
                return head;

            }
            // if some elements are left in list1
            while (tail1!=null && tail2==null){
                tail.next = new ListNode(tail1.val);
                tail = tail.next;
                tail1 = tail1.next;
            }
            while (tail2!=null && tail1==null){
                tail.next = new ListNode(tail2.val);
                tail = tail.next;
                tail2 = tail2.next;
            }

        }
        else if (list1!=null && list2==null) head = list1;
        else if (list2!=null && list1==null) head = list2;
        else head = null;


        return head;
    }
}
