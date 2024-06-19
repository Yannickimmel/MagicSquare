
package magicsquaree;

import java.util.Scanner;
/**
 *
 * @author Ykimmel
 */
public class Square {
  //--------------------------------------
    //create new square of given size
    
    //--------------------------------------
    
    private int [][] square;
    
    public Square(int size) {
        square = new int[size][size];

    }
    
    //--------------------------------------
    //create new square using given 2D array
    //--------------------------------------
    public Square(int[][] matrix) {
        square = matrix;

    }

    //--------------------------------------
    //return the square 2D array
    //--------------------------------------
    public int[][] getSquare() {
        return square;
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row) {
        int total = 0;
        //Add code here!
   
for(int c=0; c<square[0].length;c++){
    total+= square[row][c];
}
        return total;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumColumn(int col) {
        int total = 0;
        //Add code here!
        for (int[] square2 : square) {
            total += square2[col];
        }
        return total;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag() {
        int total = 0;
        //Add code here!
        /* for(int r=0; r<square.length;r++){
            
            for(int c=0;r<square[0].length;c++){
                if(r==c){
                    total+=square[r][c];
                }
                if(r+c == square.length-1){
                    total+= square[r][c];
                }
            }
                
        } */
        
        for(int i=0; i<square.length;i++){
            total+=square[i][i];
        }

        return total;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag() {
        int total = 0;
        for(int i=0; i<square.length;i++){
            total+=square[i][square.length-1-i];
        }
 
        return total;

    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean isMagic() {
        //Add code here!
        
        
        
        
        int fakesum = sumRow(0);
        for(int r=1; r<square.length;r++){
           for(int c=0; c<square[0].length;c++){
               
               if(sumColumn(c)!=fakesum || sumRow(r)!=fakesum || sumOtherDiag()!=fakesum || sumMainDiag()!=fakesum){
                   return false;
               }
           }
        }
        return true;
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
    public void readSquare(Scanner scan) {
        for (int[] square1 : square) {
            for (int col = 0; col < square.length; col++) {
                System.out.println("Enter an integer number");
                square1[col] = scan.nextInt();
            }
        }
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare() {
        for (int[] square1 : square) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square1[col] + "  ");
            }
            System.out.println("");
        }

    }
}  

