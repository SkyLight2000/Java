/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;


/**
 *
 * @author User
 */
public class Lab_3_2 {
    public static void main(String[] args) {
        int n = 5;
        int [][] matrix = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random() * 10);    
                System.out.print(matrix[i][j] + " ");              
            }
            System.out.println("");
        }
        boolean upper = true;
        boolean lower = Strue;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){  
                if (i > j && (matrix[i][j] + matrix[i][j] != 0)){
                    upper = false;
                }
                if (i < j && (matrix[i][j] + matrix[i][j] != 0)){
                    lower = false;
                }
            }
        }
        if(upper == true){
            System.out.println("Matrix is upper triangular");
        }
        else if(lower == true){
            System.out.println("Matrix is lower triangular");
        }
        else{
            System.out.println("Matrix isn't upper or lower triangular");
        }
    }
    
}
