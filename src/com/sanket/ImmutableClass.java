package com.sanket;

public final class ImmutableClass {

	private String pancardNumber;

	public ImmutableClass(String pancardNumber)

	{
		super();
		this.pancardNumber = pancardNumber;
	}

	public ImmutableClass getPancardNumber(String pancardNumber) {
		if (this.pancardNumber == pancardNumber) {
			return this;
		} else {
			return new ImmutableClass(pancardNumber);
		}
	}

}
