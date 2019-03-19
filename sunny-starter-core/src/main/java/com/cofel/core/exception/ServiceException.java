package com.cofel.core.exception;

/**
 * Service层异常
 */
public class ServiceException extends BaseException {
    private static final long serialVersionUID = -7881592574369938354L;

    public ServiceException(){}

    public ServiceException(String message){
        super(message);
    }

    public ServiceException(String code,String message){
        super(code,message);
    }
}
