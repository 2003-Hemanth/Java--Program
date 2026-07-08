package Logical;

public class ReverseArray {

	public static void main(String[] args) {
		int []h= {22,58,4,7,8,5};
		int i=0;
		int j=h.length-1;
		while(i<j)
		{
			int temp=h[i];
			h[i]=h[j];
			h[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<h.length;k++)
		{
			System.out.print(h[k]+" ");
		}

	}

}
