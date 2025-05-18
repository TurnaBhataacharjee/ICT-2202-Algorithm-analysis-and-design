package fractional.knapsack.problem;

import java.util.Comparator;

public class FKPComparator implements Comparator<FKP> {

	@Override
	public int compare(FKP o1, FKP o2) {
		// TODO Auto-generated method stub
		
		return Double.compare(o2.getprofitperweight(),o1.getprofitperweight());
	}

}
