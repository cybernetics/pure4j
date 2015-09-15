package org.pure4j.checker.basic.immutable.forced1;

import org.pure4j.Pure4J;
import org.pure4j.annotations.immutable.ImmutableValue;
import org.pure4j.annotations.pure.Enforcement;
import org.pure4j.checker.basic.support.CausesError;
import org.pure4j.checker.basic.support.ShouldBePure;
import org.pure4j.exception.PureMethodArgumentNotImmutableException;

/**
 * Broken immutable value implementation, but it's forced good.
 */
@ImmutableValue(Enforcement.FORCE)
public final class SomeValueObject {

	private final int[] someArray;

	@ShouldBePure
	public int[] getSomeArray() {
		return someArray;
	}

	@CausesError(PureMethodArgumentNotImmutableException.class)
	public SomeValueObject(int[] someArray) {
		super();
		this.someArray = someArray;
	}

	@ShouldBePure
	@Override
	public int hashCode() {
		return Pure4J.hashCode(someArray);
	}

	@ShouldBePure
	@Override
	public String toString() {
		return Pure4J.toString(this, someArray);
	}
	
	
	
}