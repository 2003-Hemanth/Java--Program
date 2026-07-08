package Logical;

public class BubbleSort {

	public static void main(String[] args)
	{
		int [] abd= {88,54,24,100,258,36};
	
			 for (int j=0;j<abd.length-1;j++)
			 {
				 for (int i=0;i<abd.length-1;i++)
				 {
					 if(abd[i]>abd[i+1])
					 {
						 int temp=abd[i];
						 abd[i]=abd[i+1];
						 abd[i+1]=temp;
						 
						 
					 }
				 }
				 
			 }
				 for(int k=0;k<=abd.length;k++)
				 {
					 System.out.println(abd[k]+" ");
				 }
          


				 
			 }
		}

	


