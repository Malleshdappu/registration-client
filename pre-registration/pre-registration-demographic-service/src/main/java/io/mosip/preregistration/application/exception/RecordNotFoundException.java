package io.mosip.preregistration.application.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;

/**
 * OperationNotAllowedException
 * 
 * @author M1043226
 *
 */
public class RecordNotFoundException extends BaseUncheckedException {

	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String msg) {
		super("", msg);
	}

	public RecordNotFoundException(String errCode, String msg) {
		super(errCode, msg);
	}

	public RecordNotFoundException(String errCode, String msg, Throwable cause) {
		super(errCode, msg, cause);
	}
}
