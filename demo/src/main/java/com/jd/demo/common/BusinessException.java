package com.jd.demo.common;

/***
 * 隐藏处理包装类
 * @author wywangyong
 *
 */
@SuppressWarnings("serial")
public class BusinessException extends Exception {

	public BusinessException() {
		super();
	}

	public BusinessException(String s) {
		super(s);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

}
