
public class car implements Comparable<car>{
	int cost;
	car (int cost){
	this.cost=cost;
}
	@Override
	public String toString() {
		return  "cost:"+cost;
	}
	@Override
	public int compareTo(car c) {
		return this.cost-c.cost;
	}
	
}
 