package com.interface21.core;

public class NestedRuntimeException extends RuntimeException implements HasRootCause {

	private Throwable rootCause;
	
	@Override
	public Throwable getRootCause() {
		return rootCause;
	}

}
