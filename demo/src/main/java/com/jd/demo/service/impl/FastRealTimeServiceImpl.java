package com.jd.demo.service.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.demo.common.BusinessException;
import com.jd.demo.common.UnixTimeStampUtil;
import com.jd.demo.dao.FastRealTimeDao;
import com.jd.demo.service.FastRealTimeService;

@Service
public class FastRealTimeServiceImpl implements FastRealTimeService {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private  FastRealTimeDao fastRealTimeDao;
	
	@Override
	public BigDecimal queryDayTradeMoneyLimit(Map<String, Serializable> para)throws BusinessException {
		
		if(null == para){
			logger.error("the parameter map is null ");
			throw new BusinessException("the parameter map is null ");
		}
		
		Serializable bankCardNo =  para.get("bankCardNo");
		if(null == bankCardNo){
			logger.error("bank Card No is null ");
			throw new BusinessException("bank Card No is null ");
		}
		
		Serializable tradeTime = para.get("tradeTime");
		if(null == tradeTime){
			logger.error("trade time is null ");
			throw new BusinessException("trade time is null ");
		}
		
		Map<String,Serializable> paraMap = new HashMap<String,Serializable>();
		
		paraMap.put("bankCardNo", bankCardNo);
		paraMap.put("tranStartTime1", UnixTimeStampUtil.dateZeroMills((Long)tradeTime));
		paraMap.put("tranStartTime2", UnixTimeStampUtil.date24Mills((Long)tradeTime));
		
		
		BigDecimal result = fastRealTimeDao.queryDayTradeMoneyLimit(paraMap);
		
		return result;
	}

}
