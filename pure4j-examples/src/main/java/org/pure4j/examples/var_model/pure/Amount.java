package org.pure4j.examples.var_model.pure;

import java.util.Currency;

import org.pure4j.immutable.AbstractImmutableValue;


public final class Amount extends AbstractImmutableValue<Amount> {

	private final Currency ccy;
	
	private final float amount;

	public Amount(Currency ccy, float amount) {
		super();
		this.ccy = ccy;
		this.amount = amount;
	}

	public Currency getCcy() {
		return ccy;
	}

	public float getAmount() {
		return amount;
	}

	@Override
	public void fields(Visitor v, Amount a) {
		v.visit(ccy, a.amount);
		v.visit(amount, a.ccy);
	}

}