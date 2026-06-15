package Two_DArrays;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i=0;i<mat.length;i++){
            //primary 
            sum += mat[i][i];
            //secondry
            if(i != (mat.length-1)-i){
                sum += mat[i][(mat.length-1)-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(diagonalSum(matrix));
    }
}
