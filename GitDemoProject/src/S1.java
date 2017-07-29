
public class S1 {
public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			int temp = 0;
			for(int num=i; num>=1;num--)
			{
				
				if((i%num)==0)
				{
				temp = temp+1;
				}
			}
			
			if(temp == 2)
			{
				System.out.println(+i+"\t");
			}
		}
		System.out.println("After git");
		System.out.println("After giti");
		System.out.println("After git1");
		System.out.println("After new change");
		
		
	}

}
