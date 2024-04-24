import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	  digitList = new ArrayList<Integer>();
	  int cool = num / 10;
    	  digitList.add(0, new Integer(num % 10));
          while(cool > 0){
          	digitList.add(0, new Integer(cool % 10));
          	cool /= 10;
          }  
	}

	public boolean isStrictlyIncreasing()
	{
	  for(int i = 1; i < digitList.size(); i++)
          	if(digitList.get(i - 1).compareTo(digitList.get(i)) >= 0){
          		return false;
	  	}else{
 	  		return true;
	  	}
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
