package fin;
import java.util.*;
public class cric2 {
public static void main(String args[])
{
	Scanner sc = new Scanner (System.in);
	int p1t,p2t,p1,p2,to;
	to=(int)Math.random();
	boolean toss = (to>0.5) ? true : false ;
	System.out.println("use numbers 1,2,3,4,5,6");
	p1t=p2t=0;
	p1=p2=0;
	if(toss)
	{
		System.out.println("You have to bat first");
		while(true)
		{
			System.out.println("enter your number");
			p1=sc.nextInt();
			p2=(int)(6*(Math.random()));
			System.out.println("Computer chooses : " + p2);
			if(p1==p2)
			{
				System.out.println("End of The innings.Your total = "+ p1t);
				break;
			}
			else
				p1t=p1t+p1;
		}
		while(true)
		{
			System.out.println("enter your number");
			p1=sc.nextInt();
			p2=(int)(6*Math.random());
			System.out.println("Computer chooses : " + p2);
			if(p1==p2)
			{
				System.out.println("End of The innings.computer's total = "+ p2t);
				break;
			}
			else if(p2t>p1t)
				break;
			else
				p2t=p2t+p2;
		}
		
	}
	if(!toss)
	{
		System.out.println("You have to bowl first");
		while(true)
		{
			System.out.println("enter your number");
			p1=sc.nextInt();
			if(p1>6)
			{
				System.out.println("enter correct number");
				continue;
			}
			p2=(int)(6*(Math.random()))+1;
			System.out.println("Computer chooses : " + p2);
			if(p1==p2)
			{
				System.out.println("End of The innings.Computer's total = "+ p2t);
				break;
			}
			else
				p2t=p2t+p2;
		}
		
		while(true)
		{
			System.out.println("enter your number");
			p1=sc.nextInt();
			p2=(int)(6*Math.random())+1;
			if(p1>6)
			{
				System.out.println("enter correct number");
				continue;
			}
			System.out.println("Computer chooses : " + p2);
			if(p1==p2)
			{
				System.out.println("End of The innings.Your total = "+ p1t);
				break;
			}
			else if(p1t>p2t)
				break;
			else
				p1t=p1t+p1;
		}
		
	}
	if(p1t>p2t)
		System.out.println("You won the game");
	else if(p2t>p1t)
		System.out.println("Computer won the game");
	else
		System.out.println("Match drawn");
	
}
}
