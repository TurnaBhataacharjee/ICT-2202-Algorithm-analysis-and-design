package activity.selection.problem;

import java.util.Comparator;

public class ASPComparator implements Comparator<ActivitySelectionProblem> {

	@Override
	public int compare(ActivitySelectionProblem o1, ActivitySelectionProblem o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getFinish(), o2.getFinish());
	}
	public int compare1(ActivitySelectionProblem o1,ActivitySelectionProblem o2) {
		return Integer.compare(o1.getFinish(), o2.getStart());
		
	}

}
