package array;
import java.util.Arrays;
import array.ListNode;
/*
*leetcode 2. 两数相加
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();//输出的结果链表
        ListNode resTemp = res;//resTemp指向结果链表res的最后一个节点
        int nextSum = 0; //需要进位时进的数
        int flag = 0; //相加进1的标志位
        while(l1 != null && l2 != null){
            int t;
            if(flag == 0){
                t = l1.val+l2.val;
                res.val = t % 10;
                nextSum = t/10;
            }
            else{
                t = l1.val+l2.val+nextSum;
                res.val = t % 10;
                nextSum = t/10;
            }
        }
        return res;
    }
}