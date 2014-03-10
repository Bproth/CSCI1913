
public class longhandInt 
{
	public int[] splitNum(int input)
	{
		int[] out = new int[4];
		int i = 0;
		while (input > 0)
		{
			out[i] = input % 10;
			input = input / 10;
			i++;
		}
		return out;
	}
	
	public String nameNum(int[] in)
	{
		int digit = 0;
		int listLen = in.length;
		String digString;
		String longHand = "";
		for(int i = listLen - 1; i >= 0; i--)
		{
			digit = in[i];
			if (i == 1)
			{
				switch (digit)
				{
				case 1: digit = in[i-1];
					switch (digit)
					{
					case 1: digString = "eleven";
						break;
					case 2: digString = "twelve";
						break;
					case 3: digString = "thirteen";
						break;
					case 4: digString = "fourteen";
						break;
					case 5: digString = "fifteen";
						break;
					case 6: digString = "sixteen";
						break;
					case 7: digString = "seventeen";
						break;
					case 8: digString = "eighteen";
						break;
					case 9: digString = "nineteen";
						break;
					default: digString = "";
					}
					break;
				case 2: digString = "twenty";
					break;
				case 3: digString = "thirty";
					break;
				case 4: digString = "fourty";
					break;
				case 5: digString = "fifty";
					break;
				case 6: digString = "sixty";
					break;
				case 7: digString = "seventy";
					break;
				case 8: digString = "eighty";
					break;
				case 9: digString = "ninety";
					break;
				default: digString = "";
				}
			}
			else
			{
				if (i==0 && in[1] != 1)
				{
					switch (digit)
					{
					case 1: digString = "one";
						break;
					case 2: digString = "two";
						break;
					case 3: digString = "three";
						break;
					case 4: digString = "four";
						break;
					case 5: digString = "five";
						break;
					case 6: digString = "six";
						break;
					case 7: digString = "seven";
						break;
					case 8: digString = "eight";
						break;
					case 9: digString = "nine";
						break;
					default: digString = "";
					}
				}
				else if (i != 0)
				{
					switch (digit)
					{
					case 1: digString = "one";
					break;
					case 2: digString = "two";
						break;
					case 3: digString = "three";
						break;
					case 4: digString = "four";
						break;
					case 5: digString = "five";
						break;
					case 6: digString = "six";
						break;
					case 7: digString = "seven";
						break;
					case 8: digString = "eight";
						break;
					case 9: digString = "nine";
						break;
					default: digString = "";
					}
				}
				else
				{
					digString = "";
				}
			}
			if (i == 3)
			{
				if (digString != "")
				{
					longHand = digString + " thousand ";
				}
			}
			else if (i == 2)
			{
				if (digString != "")
				{
					longHand += digString + " hundred ";
				}
			}
			else
			{
				longHand += digString + " ";
			}
		}
		return longHand;
	}
	public void printLong(int in)
	{
		String out = nameNum(splitNum(in));
		System.out.println(out);
	}
	
	public static void main(String args[])
	{
		longhandInt test = new longhandInt();
		test.printLong(1);
		test.printLong(12);
		test.printLong(153);
		test.printLong(4016);
		test.printLong(9999);
	}
}