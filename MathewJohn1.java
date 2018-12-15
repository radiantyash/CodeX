import java.util.Scanner;
import java.util.*;

class  MathewJohn{
	public static void main(String args[]){
		Scanner sc  = new  Scanner(System.in);

		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int m = sc.nextInt();
		
		List<Integer> hl=new ArrayList<Integer>();
		List<Integer> tl=new ArrayList<Integer>();

		for(int t = t1; t < t2; t++){
			for(int n = 1; n < t; n++){
				if(t == n*((2*n)-1)){
					hl.add(t);
				}
				if(t == (n*(n+1))/2){
					tl.add(t);
				}	
			}
		}

		int temp=0;
		for (int i = 0; i < hl.size(); i++)
		{
			if(tl.contains(hl.get(i)))
			{
				temp++;
				if(temp==m){
					System.out.println(hl.get(i));
				}
			}							
		}
		if(temp<m){
			System.out.println("No number is present at this index");
		}
    }	
}
