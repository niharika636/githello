

import java.util.*;
import java.lang.*;
 class Longest<T> {

	
	public static < E extends Comparable<E>> void print( E[] arr) {
		// TODO Auto-generated method stub
		int i,j,k,m,l,v=0;
		//E[]  z =new E [100];
		int pp1 = 0,pp2 = 0,o = 0,p = 0;
		int c=0;	
		for(i=0;i<arr.length;i++)
		{
			k=0;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])<0)
				{
					c++;
					 o = i;
					 p = j;
					k++;
				}
			}
			if(c>v)
			{
				v=c;
				pp1=o;
				pp2=p;
				
			}
		}
		for(i=pp1+1;i<=pp2;i++)
		{
				if(arr[pp1].compareTo(arr[pp2])<0)
				{
					System.out.println(arr[pp2]);
				}
		}
	}

 static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer a[]=new Integer[10];
       Character ch[]=new Character[10];
       int n,i,j,k;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
    	  a[i]=sc.nextInt();
      }
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
    	  ch[i]=sc.next().charAt(i);
      }
      Longest ll=new Longest();
     
     ll.print(ch);
      ll.print(a);
	}
	
}
