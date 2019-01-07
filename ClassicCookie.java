import java.util.Scanner;

public class ClassicCookie {

   static int[][] matrix;
   static int r, c;
  static   int count=0;



    public static int operation(int i,int j){

        if(matrix[i][j]==1){
            count++;
            matrix[i][j]=0;
            row_minus(i,j);
            column_plus(i,j);
            row_plus(i,j);
            return count;

        }
        else
            return 0;


    }



    public static void row_minus(int i,int j){
        i--;
        if(i>0 && i<r && (matrix[i][j]!=0)){
            operation(i,j);

        }



    }


    public static void column_plus(int i,int j){
        j++;
        if(j>0 && j<c && (matrix[i][j]!=0)){
            operation(i,j);

        }



    }


    public static void row_plus(int i,int j){
        i++;
        if(i>0 && i<r && (matrix[i][j]!=0)){
            operation(i,j);

        }



    }



    public static void main(String[] args) {



        System.out.println("Enter the matrix size in m & n");
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();
        c = scan.nextInt();
         matrix = new int[r][c];
        System.out.println("Enter the matrice");

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scan.nextInt();

            }
        System.out.println("Matrix Entered");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]+"  ");

            }
            System.out.println();

        }


        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                count=0;


               int k=operation(i,j);
               if(k>0){
                   System.out.println("The Number of line");
                   System.out.print(k+",");
               }
            }


        }


    }












}
