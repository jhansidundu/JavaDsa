class searchInSorted
{
   public static boolean search(int array[][],int key)
   {
     int row = 0,column = array[0].length - 1;
     while(row <= array.length -1 && column >=0)
     {
       if(array[row][column] == key)
       {
          System.out.println("the key found at " + "(" + row + "," + column + ")");
          return true;
       }
       else if(key< array[row][column])
       {
         column--;
       }
       else
       {
         row++;
       }
       
     }
     return false;
   }




  public static void main(String args[])
  {
   int matrix[][] = {{10,20,30,40},
                {25,29,35,45},
                {28,38,44,50},
                {32,39,48,55}
                    };

     search(matrix,39);
  }

}

