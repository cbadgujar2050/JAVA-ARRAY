package Array;

import java.util.Scanner;

public class twodarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int m,n,i,j;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of rows");
       m=sc.nextInt();
       System.out.println("Enter number of colomn");
       n=sc.nextInt();
       int ar[][]=new int[m][n];
        
       System.out.println("Enter number of array  elements:");
       for(i=0;i<m;i++) {//rows
    	   for(j=0;j<n;j++) {//colmn
    		   ar[i][j]=sc.nextInt();   
    	   } 
       }
       
       System.out.println(" array  elements:");
       for(i=0;i<m;i++) {//rows
    	   for(j=0;j<n;j++) {//colmn
    		 
    		 System.out.print(ar[i][j]);
    		 
    	   } 
    	   System.out.println();
       }
      
//       System.out.println("Left digonal array  elements:");
//       for(i=0;i<m;i++) {//rows
//    	   for(j=0;j<n;j++) {//colmn
//    	   		 
//    		 if(i==j) {
//    			 System.err.print(ar[i][j]);
//    		 }
//    	   }    
//       }
       
       System.out.println("Right digonal array  elements:");
       for(i=0;i<m;i++) {//rows
    	   for(j=0;j<n;j++) {//colmn n=3
    	   		// 0+2 = =3-1//0==2  //1==2 //2==2
    		  // 1+1==3-1//1==2 2 =2 
    		    //2=2		   
    		 if((i+j)==(n-1)) {
    			 System.err.print(ar[i][j]);
    		 }
    	   }    
       }
	}

}
