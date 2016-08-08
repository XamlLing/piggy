
/**  
* @Title: ApprProcException.java
* @Package: org.hpin.common.approval.exception
* @Description: 
* @author: Bhh
* @date: 2015年9月24日 下午4:45:01
* @version: V1.0  
*/ 
package org.hpin.common.approval.exception;

/**
 *  审批流异常
 * @moudle: ApprProcException 
 * @version:v1.0
 * @Description: 
 * @author: Bhh
 * @date: 2015年9月24日 下午4:45:01
 *
 */
public class ApprProcException extends Exception {
    public static String EXCEPTION_MSG = "";
	
	public ApprProcException(){
		super();
	}
	
	public ApprProcException(String msg){
		super(msg);
	}
	
	public ApprProcException(Throwable t){
		super(t);
	}
	
	
	
}
