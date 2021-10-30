package telran.util;

import java.util.function.Predicate;

public class RetainAllPredicate<T> implements Predicate<T> {
	List<T> others;
	public RetainAllPredicate(List<T> others) {
		this.others = others;
	}
	@Override
	public boolean test(T t) {
		return !others.contains(t);
	}

}
