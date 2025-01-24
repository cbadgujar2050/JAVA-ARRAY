package Array;

public class arracnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {6,7,4,7,3,1,2,6,2,9,8,6,3,2};
		  int ecnt=0;
		  int ocnt=0;
		  for(int i=0;i<a.length;i++) {
			  System.out.println(a[i]);
			  if(a[i]%2==0) {
				  ecnt++;
			  }else {
				  ocnt++; 
			  }
		  }
		  System.out.println("Number of Evens "+ecnt+" times");
		  System.out.println("Number of Odds "+ocnt+" times");
	}

}
