package fractional.knapsack.problem;

public class FKP {
	private int weight;
	private int profit;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public double getprofitperweight() {
		// TODO Auto-generated method stub
		return (double)profit/weight;
	}
	
	@Override
	public String toString() {
		return "FKP [weight=" + weight + ", profit=" + profit + "]";
	}
	
	

}
