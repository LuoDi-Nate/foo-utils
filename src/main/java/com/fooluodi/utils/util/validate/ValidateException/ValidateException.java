package com.fooluodi.utils.util.validate.ValidateException;

import com.fooluodi.utils.exception.IExceptionCode;
import com.fooluodi.utils.exception.SystemException;

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
