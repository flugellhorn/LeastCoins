import java.util.ArrayList;

/**
 * 
 * @author Andrew Szlembarski
 * Description: This calculates the least amount of 7 and 5 cent coins needed to add up to
 * the originally input number
 *
 **/

public class Postage {

    private static ArrayList<Integer> solve(int data) {
    	ArrayList<Integer> answer = new ArrayList<Integer>();
        int cents5 = 0;
        int cents7 = 0;
        while(data != 0){
        	if(data%5==0){
        		cents5 += data/5;
        		answer.add(0,cents5);
        		answer.add(1,cents7);
        		return answer;
        	}
        	else{
        		data -=5;
        		cents5++;
        	}
        	if(data%7==0){
        		cents7 += data/7;
        		answer.add(0,cents5);
        		answer.add(1,cents7);
        		return answer;
        	}
        	else{
        		data-=7;
        		cents7++;
        	}
        }
        answer.add(0,cents5);
		answer.add(1,cents7);
        return answer;
    }
    
    public static void main(String[] args){
    	//Change input to whatever amount you want to calculate postage for
    	int input = 451;
    	ArrayList<Integer> response = solve(input);
    	System.out.println("5 Cents: " + response.get(0) + "\n7 Cents: " + response.get(1));
    }
}
