package org.pure4j.checker.corner_cases.enums;

import java.io.IOException;

import org.junit.Test;
import org.pure4j.annotations.immutable.ImmutableValue;
import org.pure4j.annotations.pure.Pure;
import org.pure4j.checker.support.AbstractChecker;
import org.pure4j.checker.support.ShouldBePure;

public class ImmutableEnum extends AbstractChecker {

	@ImmutableValue
	static enum Blah { A, B }
	
	@ShouldBePure
	@Pure
	public void consumeBlah(Blah b) {
	}
	
	@Test
	public void checkThisPackage() throws IOException {
		checkThisPackage(this.getClass(), 1);
	}
}