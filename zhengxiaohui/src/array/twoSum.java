package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * leetcode 1. 两数之和-哈希表
 *创建哈希表，对于每一个x，先查询哈希表中是否存在target-x，然后将x插入到哈希表中
 * 时间复杂度：O（N）
 * 空间复杂度：O（N）
 */
class Solution1 {
    public int[] twoSum(int[] nums, int target){
        int len = nums.length;
        Map<Integer,Integer>HashTable = new HashMap<>(len-1);
        HashTable.put(nums[0], 0);
        for (int i=1;i<len;i++){
            int another = target-nums[i];
            if(HashTable.containsKey(another)){
                return new int[]{i,HashTable.get(another)};
            }
            HashTable.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Two Sum Solution!");
    }
}