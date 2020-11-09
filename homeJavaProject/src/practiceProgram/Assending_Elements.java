package practiceProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assending_Elements {
	
	
	public boolean assendingElements() {
	
    int temp=0;
	boolean flag=false;
	int array[]= {2,7,8,9,4,8,2,5,7,8,10};
	Set<Integer> set1=new HashSet<Integer>();
	Set<Integer> set2=new HashSet<Integer>();
	
	for(int i=0; i<=array.length-2;i++)
	{
		for (int j=i+1; j<=array.length-1; j++)
		{
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
    for(int ele:array)
    {
    	set1.add(ele);
    	set2.add(ele);
    }
    
    System.out.println(set1);
    System.out.println(set2);
    
    if(set1.equals(set2))
    {
    	flag=true;
    }
    else
    {
    	flag=false;
    }
	
//	Iterator<Integer>it=set1.iterator();
//	while(it.hasNext())
//	{
//		System.out.println(it.next());
//	}
	return flag;
	
	}
	
	public static void main(String[] args) {
		Assending_Elements obj=new Assending_Elements();
		obj.assendingElements();
		
	}
}
