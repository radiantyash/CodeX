import java.util.*;
import java.util.Scanner;

class DA002BN{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[t];

		for(int i=0;i<t;i++){
			arr[i]=sc.nextInt();
		}
	
		ArrayList<Integer> li = new ArrayList<Integer>();
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		li.add(arr[0]); 		
		for(int i=1;i<t;i++){
                    if(li.get(li.size()-1)<=arr[i]){
			li.add(arr[i]);
                    }else{
                        if(tmp.size()<=li.size()){
                            tmp.clear();
                            tmp=(ArrayList<Integer>)li.clone();
                            li.clear();
                            li.add(arr[i]); 		
                        }
                    }
		}

		System.out.println();
                if(li.size()>tmp.size()){ 
                    Iterator itr=li.iterator();
                    while(itr.hasNext()){
			System.out.print(itr.next()+" ");
                    }
                }else{
                    Iterator itr=tmp.iterator();
                    while(itr.hasNext()){
                      	System.out.print(itr.next()+" ");
                    }
                }
	}
}
