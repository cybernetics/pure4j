package org.pure4j.checker.basic.mutable_unshared.narrowing;

import java.io.IOException;

import org.junit.Test;
import org.pure4j.checker.AbstractChecker;

public class TestCheckNarrowIsPure extends AbstractChecker {

	@Test
	public void checkThisPackage() throws IOException {
		checkThisPackage(this.getClass(), 1);
	}
}