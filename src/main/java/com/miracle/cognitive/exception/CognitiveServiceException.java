package com.miracle.cognitive.exception;

import java.io.IOException;

public class CognitiveServiceException extends Exception {

	private String errorCode;
	private String errorDescription;
	private String className;
	private String methodName;

	private static final long serialVersionUID = -816387637206481014L;

	/**
	 * 
	 */
	public CognitiveServiceException() {
	}

	/**
	 * @param message
	 */
	public CognitiveServiceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public CognitiveServiceException(Throwable cause) {
		super(cause);
	}

	public CognitiveServiceException(String erroCode, String errorDescription) {
		this.errorCode = erroCode;
		this.errorDescription = errorDescription;
	}

	public CognitiveServiceException(Throwable cause, String erroCode, String errorDescription) {
		super(cause);
		this.errorCode = erroCode;
		this.errorDescription = errorDescription;
	}

	public CognitiveServiceException(Throwable cause, String errorDescription) {
		super(cause);
		this.errorDescription = errorDescription;
		this.errorCode = getExceptionDetails(cause);
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorDescription
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * @param errorDescription the errorDescription to set
	 */
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the methodName
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * @param methodName the methodName to set
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getExceptionDetails(Throwable cause) {
		String errorCode = CognitiveErrorCodes.UNKOWN_ERROR;
		if (cause instanceof NullPointerException) {
			errorCode = CognitiveErrorCodes.NULLPOINTER_EXCEPTION;
		} else if (cause instanceof InterruptedException) {
			errorCode = CognitiveErrorCodes.INTERUPPTED_EXCEPTION;
		} else if (cause instanceof NumberFormatException) {
			errorCode = CognitiveErrorCodes.NUMBERFORMAT_EXCEPTION;
		} else if (cause instanceof ArrayIndexOutOfBoundsException) {
			errorCode = CognitiveErrorCodes.ARRAYINDEX_OUTBOUND_EXCEPTION;
		} else if (cause instanceof ArithmeticException) {
			errorCode = CognitiveErrorCodes.ARITHMETIC_EXCEPTION;
		} else if (cause instanceof IOException) {
			errorCode = CognitiveErrorCodes.IO_EXCEPTION;
		}
		return errorCode;
	}
}
