import java.util.*;
public class Student_grades {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of subjects");
		int n=sc.nextInt();
		int[] marks=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter marks of subject "+(i+1)+" out of 100");
			marks[i]=sc.nextInt();
		}
		float sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+marks[i];
		}
		float avg=sum/n;
		String grade = null;
		if(avg>90 && avg<=100)
		{
			grade="O grade:Outstanding";
		}
		else if(avg>80 && avg<=90)
		{
			grade="A+ grade:Excellent";
		}
		else if(avg>70 && avg<=80)
		{
			grade="A grade:Very Good";
		}
		else if(avg>60 && avg<=70)
		{
			grade="B+ grade:Good";
		}
		else if(avg>50 && avg<=60)
		{
			grade="B grade:Average";
		}
		else if(avg>40 && avg<=50)
		{
			grade="C grade:Pass";
		}
		else if(avg<=40)
		{
			grade="F grade:Fail";
		}
		System.out.println("====================================================================================================\n");
		System.out.println("Details are:\n");
		System.out.println("Total marks: "+sum+"\nAverage percentage: "+avg+" "+"\nGrade:  "+grade);
		System.out.println("====================================================================================================\n");
	}

}
