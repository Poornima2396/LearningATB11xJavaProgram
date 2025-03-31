package ex_015_Arrays;

public class Lab0147_2D_Array_Iterate_ForLoop {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}}; //3rows, 3 column

        //matrix.length will always give you number of rows ******

        for (int i=0; i<matrix.length; i++) { //matrix.length gives no. of rows
            for(int j=0; j<matrix[i].length; j++){ //matrix[i].length gives columns
                System.out.print(matrix[i][j]+ " ");// element prints with space
                //1 2 3
                //4 5 6
                //7 8 9
                //System.out.print("*" +" "); //all will get printed *
                //* * *
                //* * *
                //* * *
            }
            System.out.println(); //prints line by line

        }


    }
}
