package com.fooluodi.broker.util.validate.ValidateException;

import com.fooluodi.broker.exception.IExceptionCode;
import com.fooluodi.broker.exception.SystemException;

/**
 * Created by di on 19/7/2016.
 */
public class ValidateException extends SystemException {
    public ValidateException(IExceptionCode code) {
        super(code);
    }

    public ValidateException(IExceptionCode code, String message,
                                 Throwable cause) {
        super(code, message, cause);
    }

    public ValidateException(IExceptionCode code, String message) {
        super(code, message);
    }

    public ValidateException(IExceptionCode code, Throwable cause) {
        super(code, cause);
    }

}
