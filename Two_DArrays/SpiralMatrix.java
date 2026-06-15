package Two_DArrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int SC = 0;
        int EC = matrix[0].length-1;
        int SR = 0;
        int ER = matrix.length-1;
        while(SC <= EC && SR <= ER){
            for(int i=SC;i<=EC;i++){
                list.add(matrix[SR][i]);
            }
            for(int i=SR+1;i<=ER;i++){
                list.add(matrix[i][EC]);
            }
            for(int i=EC-1;i>=SC;i--){
                if(SR == ER){
                    break;
                }
                list.add(matrix[ER][i]);
            }
            for(int i=ER-1;i>=SR+1;i--){
                if(SC == EC){
                    break;
                }
                list.add(matrix[i][SC]);
            }
            SC++;
            SR++;
            EC--;
            ER--;
        }
        return list;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(spiralOrder(matrix));
    }
}
