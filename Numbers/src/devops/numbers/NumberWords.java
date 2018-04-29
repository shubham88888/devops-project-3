package devops.numbers;

import java.text.NumberFormat;
import java.util.Scanner;

public class NumberWords {
	public static final String[] units={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve",
		    "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
			public static final String[] tens={
					"",       //0
					"",      //1
					"Twenty",
					"Thirty",
					"Fourty",
					"Fifty",
					"Sixty",
					"Seventy",
					"Eighty",
					"Ninety"
					};
			
			public static String convert(final int n)
			{
				if(n < 0)
				{
				    return "Minus" + convert(-n);
				}

				if(n < 20)
				{
					return units[n];
				}
				if(n < 100)
				{
					return tens[n/10]+((n%10!=0) ? " ":"")+ units[n%10];
				}
				if(n < 1000)
				{
					return units[n/100]+" "+"Hundred"+((n%100!=0) ? " ":"")+ convert(n%100);
				}
				if(n < 100000)
				{
					return convert(n/1000)+" "+"Thousand"+((n%1000!=0) ? " ":"")+ convert(n%1000);
				}
				if(n < 10000000)
				{
					return convert(n/100000)+" "+"Lakh"+((n%100000!=0) ? " ":"")+ convert(n%100000);
				
				}
					return convert(n/10000000)+" "+"Crore"+((n%10000000!=0) ? " ":"")+ convert(n%10000000);
				
			}

			public static void main(final String[] args){
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the value you want to convert:");
				String input = scanner.nextLine();
                int n = Integer.parseInt(input);
				System.out.println(NumberFormat.getInstance().format(n)+"='"+convert(n)+"'");
			}

}
