package _13_LinkedList.DLL;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}
class DLL_Palindrome {
    public static void revPrint(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node){
        dNode temp = node;
        while (temp.prev!=null){
            temp = temp.prev;
        }
        //Now we are on head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static boolean palindrome(dNode head){
        dNode t1 = head;
        dNode t2 = head;
        int len = 1;
        while (t2.next!=null){
            t2 = t2.next;
            len++;
        }
        int n = len/2;
        for(int i=1;i<=n;i++){
            if(t1.val==t2.val){
                t1 = t1.next;
                t2 = t2.prev;
            } else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);
        dNode e = new dNode(30);
        dNode f = new dNode(20);
        dNode g = new dNode(10);
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        e.next = f; f.prev = e;
        f.next = g; g.prev = f;
        System.out.println(palindrome(a));
    }
}
