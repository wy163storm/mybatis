package com.jd.demo.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jd.demo.common.BusinessException;
import com.jd.demo.service.FastRealTimeService;
import com.jd.demo.service.impl.FastRealTimeServiceImpl;

/**
 * Risk Demo
 * @author wywangyong
 *
 */
public class TestFastRealTimeDao extends TestCase {
	
	protected final String CONFIGLOCATION = "classpath:/appContext.xml";
	protected ApplicationContext ctx = null;
	@Override
	protected void setUp() throws Exception {
	
		ctx = new ClassPathXmlApplicationContext(CONFIGLOCATION);
	}
	
	
	@Test
	public void testQueryDayTradeMoneyLimit(){
		FastRealTimeService service = ctx.getBean(FastRealTimeServiceImpl.class);
		Map<String,Serializable> para = new HashMap<String,Serializable>();
		
		para.put("bankCardNo", "7db10b6500d8a631de0bb87828b195e1");
		para.put("tradeTime", 1379749832746l);
		BigDecimal value = BigDecimal.ZERO;
		
		try {
			value = service.queryDayTradeMoneyLimit(para);
			System.out.println("value=["+value+"]");
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}
}
