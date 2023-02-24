class SpiralMatrix
{

   public static void twoarray(int matrix[][]){
    int startRow = 0;
    int endRow = matrix.length - 1;
    int startColumn = 0;
    int endColumn = matrix[0].length -  1;
    while(startRow <= endRow && startColumn<= endColumn)
    {
        for(int i= startColumn;i<= endColumn;i++)
        {
          System.out.println(matrix[startRow][i]);
        }
        for(int i = startRow+1;i<=endColumn;i++)
        {
          System.out.println(matrix[i][endColumn]);
        }
        for(int i = endColumn -1;i>= startRow;i--)
        {
          System.out.println(matrix[endRow][i]);
        }
        for(int i = endRow -1;i>= startRow+1;i--)
        {
          System.out.println(matrix[i][startColumn]);
        }
        startColumn++;
        startRow++;
        endColumn--;
        endRow--;
    }
  }
  
  public static void main(String args[])
  {
     int matrix[][]={{1,2,3,10,9},{4,5,6,11,20},{7,8,9,12,21},{13,14,15,16,22},{23,24,25,26,27}};
     twoarray(matrix);
  }
}