package org.pure4j.annotations.pure;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Allows you to change the level of interface purity checking on a pure method.
 * @see org.pure4j.annotations.immutable.ImmutableValue
 * @see org.pure4j.annotations.pure.Pure
 * @see org.pure4j.annotations.mutable.MutableUnshared
 * 
 * @author robmoffat
 *
 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface PureInterface {

	public Enforcement value() default Enforcement.NOT_PURE;
}
