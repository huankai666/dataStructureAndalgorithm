package algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MedianFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        MedianFinder obj = new MedianFinder();
        for (String num : nums) {
            obj.addNum(Integer.parseInt(num));
        }
        double param_2 = obj.findMedian();
        System.out.println(param_2);
    }

    /*1. 直接插入，取数据的时候进行排序
    public ArrayList<Integer> list;

    public MedianFinder() {
        this.list = new ArrayList<>();
    }

    public void addNum(int num) {
        this.list.add(num);
    }

    public double findMedian() {
        this.list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int size = this.list.size();
        if (size % 2 == 0) {
            return (double) (this.list.get(size / 2 - 1) + this.list.get(size / 2)) / 2;
        } else {
            return (this.list.get(size / 2));
        }
    }*/

    /*2. 插入的时候进行排序
    public ArrayList<Integer> list;

    public MedianFinder() {
        this.list = new ArrayList<>();
    }

    public void addNum(int num) {
        if (this.list.size() == 0 || this.list.get(this.list.size() - 1) < num) {
            this.list.add(num);
        } else {
            int i = 0;
            while (this.list.get(i) < num) {
                i++;
            }
            this.list.add(i, num);
        }
    }

    public double findMedian() {
        int size = this.list.size();
        if (size % 2 == 0) {
            return (double) (this.list.get(size / 2 - 1) + this.list.get(size / 2)) / 2;
        } else {
            return (this.list.get(size / 2));
        }
    }*/

    public ArrayList<Integer> list;

    public MedianFinder() {
        this.list = new ArrayList<>();
    }

    public void addNum(int num) {
        if (this.list.size() == 0 || this.list.get(this.list.size() - 1) < num) {
            this.list.add(num);
        } else {
            int i = 0;
            while (this.list.get(i) < num) {
                i++;
            }
            this.list.add(i, num);
        }
    }

    public double findMedian() {
        int size = this.list.size();
        if (size % 2 == 0) {
            return (double) (this.list.get(size / 2 - 1) + this.list.get(size / 2)) / 2;
        } else {
            return (this.list.get(size / 2));
        }
    }
}