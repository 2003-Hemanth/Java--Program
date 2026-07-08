package Logical;

public class Bubble {

	public static void main(String[] args) {
		int [] r= {55,9,25,1258,52,54,258};
		 for(int j=0;j<r.length-1;j++)
		 {
			 for(int i=0;i<r.length-1;i++)
			 {
				 if(r[i]<r[i+1])
				 {
					 int temp=r[i];
					 r[i]=r[i+1];
					 r[i+1]=temp;
					 
				 }
			 }
		 }
          for(int k=0;k<r.length;k++)
          {
        	  System.out.print(r[k]+" ");
          }
	}

}
