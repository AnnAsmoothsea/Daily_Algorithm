//在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
//请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。


package helloworld;

public class Solution {
    public static boolean Find(int target, int [][] array) {
          int row_len = array.length;
          int column_len = array[0].length;
          int row = 0;
          int column = 0;
        for(row = 0,column = column_len - 1;row<row_len&&column>=0;){
            if(target > array[row][column]){
                row++;
                continue;
            }
             if(target < array[row][column]){
                column--;
                continue;
            }
            if(target == array[row][column]){
                return true;
            }
            
        }
        return false;
    }
    
    public static void main(String[] args){
        int[][] arr = { {1,2,8,9}, {2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(6,arr));
    }
}
