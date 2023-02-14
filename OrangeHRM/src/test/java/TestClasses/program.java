package TestClasses;

public class program {

	public static void main(String[] args) {
		
		//swap the number without using third varible
		
//		int a =10;
//		int b =20;
//		
//		b = b-a;
//		a = a + b;
//		System.out.println(a+" is value of a ");
//		System.out.println(b+" is value of b ");
		
		//swap the number without using third varible for complex number
		int a = 24;
		int b = 23;
		
		b = a-b;
		b =a/b;
		a = b-1;
		System.out.println(a+" is value of a");
		System.out.println(b+ " is value of b");
	
		//find max and minimum from array
		
		int aa[] = {12,2200,377,44,56,677,23};
		int max= aa[0];
		
		for(int i =1;i<=aa.length-1;i++) 
		{
			if(aa[i]>max) 
			{
		     max = aa[i];		
			}
		}
		System.out.println(max +" is max value");
		
		int aa1[] = {120,2200,377,44,56,677,293};
		int min1= aa1[0];
		
		for(int i =1;i<=aa1.length-1;i++) 
		{
			if(aa1[i]<min1) 
			{
		     min1 = aa1[i];		
			}
		}
		System.out.println(min1 +" is min1 value");
		
		//remove duplicate value from word
		String a2 = "gaurav is my name im tester";
		for(int i = 0;i<=a2.length()-1;i++) 
		{
			if(a2.charAt(i)=='a'|| a2.charAt(i)=='e'||a2.charAt(i)=='m') 
			{
		     System.out.println(a2.charAt(i)+" is duplicate word");
			}
		}
		System.out.println();
		
		//remove vowels from given sentence
		String b2 ="djdsgfjg jnffkuhgukh  wierowirowir anjklhuhrluh";
		 String b3 = b2.replaceAll("[a,e,u,i,o]","");
		 System.out.println(b3);
		 System.out.println(b3.length());
		int b4 = b2.length()-b3.length();  System.out.println(b4);
		
		//reverse the string in its own place 
		
		String n = "my name is gaurav";
		String j [] =n.split(" ");
		for(int i =0;i<=n.length()-1;i++) 
		{
			char j1 []=j[i].toCharArray();
			for(int j3 =j1.length-1;j3>=0;j3--) 
			{
				System.out.print(j1[j3]);
			}
			System.out.print(" ");
			
		}
		 
		
		
		
		
		
		
	}

}
