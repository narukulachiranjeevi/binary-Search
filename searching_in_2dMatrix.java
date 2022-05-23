class Solution {
    boolean binarysearch(int[] matrix,int target){
        int l=0,u=matrix.length-1;
        while(l<=u){
            int mid = l+((u-l)/2);
            if(matrix[mid]>target) u=mid-1;
            else if(matrix[mid]<target) l=mid+1;
            else return true;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(binarysearch(matrix[i],target)) return true;
        }
        return false;
    }
}
