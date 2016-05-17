package com.apub.dorm.exception;

import java.util.Arrays;
import java.util.List;


/**
 * 业务异常基类.
 * Since Aug 2010
 * Add errorMsg property for the hrms project, system need not support the i18n feature.
 * @author mz
 */
public class AppException extends Exception {
	public static final String NO_RIGHTS_TO_ACCESS="no.rights.to.access";
	private static final long serialVersionUID = 1L;
	private int errorCode=0;
	private String errorMsg="";
	private Throwable cause;
	private List<Object> params;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Throwable getCause() {
		return this.cause;
	}

	public List<Object> getParams() {
		return params;
	}

	public AppException(int errorCode) {
		super(String.valueOf(errorCode));
		params = null;
		this.errorCode = errorCode;
	}

	public AppException(int errorCode, Object... param) {
		super(String.valueOf(errorCode));
		initParam(errorCode, param);
	}

	public AppException(int errorCode, Throwable cause) {
		super(cause);
		this.cause = cause;
		this.errorCode = errorCode;
	}

	public AppException(int errorCode, Throwable cause, Object... param0) {
		super(cause);
		this.cause = cause;
		initParam(errorCode, param0);
	}

	private void initParam(int errorCode, Object... param) {
		this.errorCode = errorCode;
		this.params = Arrays.asList(param);
	}
	
	public AppException(String errorMsg) {
		super(errorMsg);
		params = null;
		this.errorMsg = errorMsg;
	}

	public AppException(String errorMsg, Object... param) {
		super(errorMsg);
		initParam(errorMsg, param);
	}

	public AppException(String errorMsg, Throwable cause) {
		super(cause);
		this.cause = cause;
		this.errorMsg = errorMsg;
	}

	public AppException(String errorMsg, Throwable cause, Object... param0) {
		super(cause);
		this.cause = cause;
		initParam(errorMsg, param0);
	}	

	private void initParam(String errorMsg, Object... param) {
		this.errorMsg = errorMsg;
		this.params = Arrays.asList(param);
	}
	
	public static void main(String[] a) {
		AppException ex = new AppException(111, "ddd", 888);
		List<Object> oo = ex.getParams();
		for (Object pp : oo) {
			System.out.println(pp);
		}
	}
}
