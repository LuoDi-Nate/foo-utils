package com.fooluodi.broker.util.validate.ValidateException;

import com.fooluodi.broker.exception.Desc;
import com.fooluodi.broker.exception.IExceptionCode;

/**
 * Created by di on 7/8/2016.
 */
public enum ValidatorExceptionCode implements IExceptionCode {
    @Desc(value = "校验参数失败", code = "ARG_VALIDATE_FAILED")
    ARG_VALIDATE_FAILED,

    @Desc(value = "target不允许为空", code = "TARGET_CAN_NOT_BE_NULL")
    TARGET_CAN_NOT_BE_NULL,
}
