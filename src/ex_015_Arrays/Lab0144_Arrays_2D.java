package ex_015_Arrays;

public class Lab0144_Arrays_2D {
    public static void main(String[] args) {


        //How to create the matrix
        //this is 3x3  matrix  :
        //always the index of matrix for rows and columns
        // is 0,1,2 horizontally & 0,1,2 vertically
        //1,2,3
     //1 -index 0,0   - 1st value is row -0 and 2nd value is column - 0 - 1,0,0
     //2 -index 0,1   - 1st value is row -0 and 2nd value is column - 1 - 2,0,1
     //3 -index 0,2   - 1st value is row -0 and 2nd value is column - 2 - 3,0,2
        //4,5,6
    //4 - index 1,0   - 1st value is row -1 and 2nd value is column - 0 - 4,1,0
    //5 - index 1,1   - 1st value is row -1 and 2nd value is column - 1 - 5,1,1
    //6 - index 1,2   - 1st value is row -1 and 2nd value is column - 2 - 6,1,2
        //7,8,9
    //7 - index 2,0   - 1st value is row -2 and 2nd value is column - 0 - 7,2,0
    //8 - index 2,1   - 1st value is row -2 and 2nd value is column - 1 - 8,2,1
    //9 - index 2,2   - 1st value is row -2 and 2nd value is column - 2 - 9,2,2
        //rows - 3 column - 3

        int [][] array_2d_old = {{1,2,3}, {4,5,6}, {7,8,9}};
        //or it can be written as :
        int [][] predefined = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] array;
        array = new int[][] {{10,20}, {30,40}, {50,60}};

        //10,20    ---3 rows and 2 columns
        //30,40
        //50,60


        int[][] array_2d = new int[3][3];
        //int [][]- 2matrices, array_2d is matrix name, int[3](row) [3]column
        //array index starts from 0 only.
        //now store the value array_2d[0][0] - index starts from 0
        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;

        array_2d[1][0] = 4;
        array_2d[1][1] = 5;
        array_2d[1][2] = 6;

        array_2d[2][0] = 7;
        array_2d[2][1] = 8;
        array_2d[2][2] = 9;

        //now store in memory
        //1.rows are created and then columns
        //






    }
}
