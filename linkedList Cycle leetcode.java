public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode>set=new HashSet<>();
        if(head==null||head.next==null)return false;
        else
        {
            while(head!=null)
            {
                if(set.contains(head))return true;
                else
                {
                    set.add(head);
                }
                head=head.next;
            }
        }
     return false;   
    }
}nkedLi
