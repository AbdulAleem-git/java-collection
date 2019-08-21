package collection;
import java.util.*;
import java.lang.*;
import java.io.*;
class GFGMax
 {
	public static void main (String[] args)throws Exception
	 {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String str[] = br.readLine().split(" ");
            int kth  =Integer.parseInt(str[0]);
             int size =Integer.parseInt(str[1]);
             String strarr[] = br.readLine().split(" ");
             int arr [] = new int [size];
             for( String s: strarr)
             {
                 int i = 0 ; 
                 arr[i++] = Integer.parseInt(s);
             }
             for( int j = 1; j<=arr.length ; j++){
                 
                 if(j<kth)
                    System.out.print("-1 ");
                  else
                    {
                        int tempArr[] = new int[j];
                        int max = 0;
                        for(int k =0 ; k<j;k++)
                            tempArr[k] = arr[k];
                            
                        
                        for(int i = 0 ; i < kth-1;i++){
                              for(int k = 0 ; k<tempArr.length;k++){
                                if(tempArr[k]>tempArr[max])
                                    max = k;
                            }
                            tempArr[max] = -1;
                        }
                        max = 0;
                       for(int k = 0 ; k<tempArr.length;k++){
                                if(tempArr[k]>=tempArr[max])
                                    max = k;
                       
                        }
                     System.out.print(tempArr[max]+" ");
                     }
             
        }
      System.out.println();  
        
	 }
	 
}
}