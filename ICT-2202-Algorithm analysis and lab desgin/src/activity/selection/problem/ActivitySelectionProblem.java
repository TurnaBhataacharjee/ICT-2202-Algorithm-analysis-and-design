package activity.selection.problem;

public class ActivitySelectionProblem {
	private String Activity;
	private int start;
	private int finish;
	public String getActivity() {
		return Activity;
	}
	public void setActivity(String activity) {
		Activity = activity;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getFinish() {
		return finish;
	}
	public void setFinish(int finish) {
		this.finish = finish;
	}
	@Override
	public String toString() {
		return "ActivitySelectionProblem [Activity=" + Activity + ", start=" + start + ", finish=" + finish + "]";
	}
	

}
