
package codex;
import java.util.*;
class  MathewJohn{
	public static void main(String[]args) {
		Scanner sc  = new  Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int m = sc.nextInt();

		List<Integer> ml=new ArrayList<Integer>();
		List<Integer> jl=new ArrayList<Integer>();

		for(int t = n1; t < n2; t++)
    {
			for(int n = 1; n < t; n++)
      {
				if(t == n*((2*n)-1))
					ml.add(t);
				if(t == (n*(n+1))/2)
        		jl.add(t);	
			}
		}

		int x=0;
		for (int i = 0; i < ml.size(); i++)
		{
			if(jl.contains(ml.get(i)))
			{
				x++;
				if(x==m)
        {
					System.out.println(ml.get(i));
				}
			}							
		}
		if(x<m)
    {
			System.out.println("No number is present at this index");
		}
    }	
} 

