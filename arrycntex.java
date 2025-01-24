package Array;

import java.util.Scanner;

public class arrycntex {
	public static void main(String[] args) {
		  int a[]= {6,7,4,7,3,1,2,6,7,2,9,8,6,3,2};
		  int cnt=0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter value to be search");
		  int ch=sc.nextInt();
		  for(int i=0;i<a.length;i++) {
			  //System.out.println(a[i]);
			  if(a[i]==ch) {
				  cnt++;
			  }
		  }
		  System.out.println(ch+" Occurs "+cnt+" times");
	}

}
