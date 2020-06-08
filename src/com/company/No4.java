package com.company;

public class No4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //思路：
        //从二维数组的右上角开始，比较当前元素与目标值的大小
        //1.如果 当前元素比目标值小，则该列都不需要考虑
        //2.如果 当前元素比目标值大，则该行都不需要考虑


        //特殊情况判断 其中第二段特例我没看明白
        if((matrix == null || matrix.length == 0) || (matrix.length == 1 && matrix[0].length == 0))
            return false;

        int i=0, j=matrix[0].length-1;//对应右上角的位置
        //对于二维数组，行总数 = matrix.length   列总数 = matrix[0].length
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target) return true;//一定先判断相等，再去调整索引，否则可能会越界
            if(matrix[i][j] > target) j--;
            else i++;
        }
        return false;

    }


}
