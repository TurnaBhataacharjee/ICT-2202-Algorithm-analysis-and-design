package fractional.knapsack.problem;

import java.util.ArrayList;
import java.util.Collections;


public class FKPmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FKP>list=new ArrayList<FKP>();
		FKP item1=new FKP();
		item1.setWeight(3);
		item1.setProfit(12);
		
		
        FKP item2=new FKP();
		item2.setWeight(1);
		item2.setProfit(5);
		
        FKP item3=new FKP();
		item3.setWeight(4);
		item3.setProfit(16);
		
        FKP item4=new FKP();
		item4.setWeight(2);
		item4.setProfit(7);
		
        FKP item5=new FKP();
		item5.setWeight(9);
		item5.setProfit(9);
		
		FKP item6=new FKP();
		item6.setWeight(4);
		item6.setProfit(11);
		
		FKP item7=new FKP();
		item7.setWeight(3);
		item7.setProfit(6);
		
		
		list.add(item1);
		list.add(item2);
		list.add(item3);
		list.add(item4);
		list.add(item5);
		list.add(item6);
		list.add(item7);
		
		
		Collections.sort(list, new FKPComparator());
		
		int currentweight=0;
		double maxprofit=0;
		int maxweight=15;
		for(FKP i:list) {
			if(currentweight+i.getWeight()<=maxweight) {
				currentweight+=i.getWeight();
				maxprofit+=i.getProfit();
			}
			else {
				int remainingweight=maxweight-currentweight;
				maxprofit+=i.getprofitperweight()*remainingweight;
				break;
			}
		}
		System.out.println("The maximum profit is "+maxprofit);
		
		
		
		
		   
		
		
	}

}
