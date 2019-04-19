package com.lxbb.user.base.exception;

/**
 * @description:
 * @version: 1.0
 * @author: zhaowei.zhang01@hand-china.com
 * @date: 2019/4/19
 */
public class MyException extends RuntimeException {
    private static final long serialVersionUID = -1L;
    protected String code;
    protected Object[] args;
    protected String msg;

    public MyException(String code) {
        this(code, (Object[]) null, (String) null, (Throwable) null);
    }

    public MyException(String code, Object[] args, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.args = args;
        this.msg = message;
    }
}
