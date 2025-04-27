package com.interface21.core;

public class NestedRuntimeException extends RuntimeException implements HasRootCause {

	/**
	 * Nested Exception to hold wrapped exception.
	 */
	private Throwable rootCause;

	/**
	 * Constructs a <code>ExceptionWrapperException</code> with the specified detail
	 * message.
	 * 
	 * @param s the detail message
	 */
	public NestedRuntimeException(String s) {
		super(s);
	}

	/**
	 * Constructs a <code>RemoteException</code> with the specified detail message
	 * and nested exception.
	 *
	 * @param s  the detail message
	 * @param ex the nested exception
	 */
	public NestedRuntimeException(String s, Throwable ex) {
		super(s);
		rootCause = ex;
	}

	@Override
	public Throwable getRootCause() {
		return rootCause;
	}

	/**
	 * Returns the detail message, including the message from the nested exception
	 * if there is one.
	 */
	public String getMessage() {
		if (rootCause == null)
			return super.getMessage();
		else
			return super.getMessage() + "; nested exception is: \n\t" + rootCause.toString();
	}

}
