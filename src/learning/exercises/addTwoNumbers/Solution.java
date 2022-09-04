package learning.exercises.addTwoNumbers;

public class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l3 = new ListNode();
            ListNode temp = l3;
            int x = 0;
            while( l1 != null || l2 != null || x == 1){
                int sum = 0;
                if(l1 != null){
                    sum += l1.value;
                    l1 = l1.next;
                }
                if(l2 != null){
                    sum += l2.value;
                    l2 = l2.next;
                }
                sum += x;
                x = sum/10;
                ListNode node = new ListNode(sum % 10);
                temp.next = node;
                temp = temp.next;
            }
            return l3.next;
        }
    }

