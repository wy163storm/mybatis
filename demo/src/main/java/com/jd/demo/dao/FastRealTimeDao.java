package com.jd.demo.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

import com.jd.demo.annotation.MyBatisRepository;

/***
 * 快捷交易限额规则
 * @author wywangyong
 */
@MyBatisRepository
public interface FastRealTimeDao extends Serializable {

	/**
	 * 日交易限定规则
	 * @param para MaperSQl的参数值
	 * @return BigDecimal
	 */
	public BigDecimal queryDayTradeMoneyLimit(Map<String, Serializable> para);
}
