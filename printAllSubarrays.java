class printAllSubarrays
{
  public static void main(String args[])
  {
     int arr[];
     arr =  new int[]{2,3,4,5,6};
     for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
        for(int j=i+1;j<arr.length;j++)
        {
          for(int k = i;k<=j;k++)
          { 
           
            System.out.print(arr[k]);
          }
            System.out.println();
        }
        System.out.println();
      }
  }
}