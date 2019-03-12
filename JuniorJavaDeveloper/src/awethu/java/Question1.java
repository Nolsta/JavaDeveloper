package awethu.java;

import java.util.Random;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numbers=new Random();
		int[] num=new int[10];
        
		for(int i=1;i<num.length;i++)
        num[i]=numbers.nextInt(100);
        
		System.out.println("-------Before------  ");
    	for(int i=1;i<10;i++)
    	{
    		System.out.println(num[i]);
    	}
for(int i=1;i<10;i++)
{
	for(int j=0;j<9;j++)
	{
		int k=j+1;//this is to point to the position 1
		int temp=num[j];//position 0
		int temp1=num[k];//position1
		
		if(temp1<temp) //is position 1 less than position 0?
		{
			num[j]=temp1;
			num[k]=temp;
		}
	}
}
//Arrays.sort(num);

	System.out.println("-------After-------");
	for(int i=1;i<10;i++)
	{
		System.out.println(num[i]);
	}
	
	}
}
