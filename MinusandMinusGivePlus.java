import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.nextLine();
      while(t-->0)
      {
      	String s1=sc.nextLine();
      	String s2=sc.nextLine();
      	char []a=s1.toCharArray();
      	char []b=s2.toCharArray();
      	//StringBuilder c=new StringBuilder();
      	int n=a.length;
      	int m=b.length;
      	int flag=0,i,j;
      	if(n<m)
      	{
      		System.out.println("NO");
      		continue;
      	}
      	if(n==m)
      	{
      		if(s1.equals(s2))
      		{
      			System.out.println("YES");
      			continue;
      		}
      		else
      		{
      			System.out.println("NO");
      			continue;
      		}
      		 
      	}
      	if(n>m)
      	{
      	for(i=0,j=0;i<n || j<m;i++,j++)
      	{
      		if(j==m)
      		 {
      		 	flag=1;
      		 	break;
      		 }
      		if(a[i]==b[j])
      		{
      			continue;
      		}
      		else
      		{
      			//System.out.println("else");
      			
      			if(a[i]=='-' && a[i+1]=='-')
      			{
      				if(b[j]=='+')
      				{
      				 i=i+1;	
      				 continue;
      				}
      				 else
      				 {
      				 	//System.out.println("hi");
      				 	flag=1;
      				 	break;
      				 }
      			}
      			else
      			{
      				flag=1;
      				break;
      			}
      		}
      	}
      	}
      	if(flag==1) 
         System.out.println("NO");
        if(flag==0)
         System.out.println("YES");
      }
      
    }
  }