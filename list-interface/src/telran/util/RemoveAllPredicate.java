package telran.util;

import java.util.function.Predicate;

public class RemoveAllPredicate<T> implements Predicate<T> {
public RemoveAllPredicate(List<T> others) {
		this.others = others;
	}
List<T> others;
	@Override
	public boolean test(T t) {
		return others.contains(t);
	}

}
