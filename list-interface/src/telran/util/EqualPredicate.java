package telran.util;

import java.util.function.Predicate;

public class EqualPredicate<T> implements Predicate<T> {
T pattern;
	public EqualPredicate(T pattern) {
		this.pattern = pattern;
	}

	@Override
	public boolean test(T t) {
		return t.equals(pattern);
	}

}
