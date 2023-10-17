import java.util.Comparator;

public class SortByCost implements Comparator<car> {

	@Override
	public int compare(car x, car y) {
		return y.cost-x.cost;
	}

}
