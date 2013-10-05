package com.jd.demo.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

import com.jd.demo.common.BusinessException;
/**
 * 快捷业务
 * @author wywangyong
 *
 */
public interface FastRealTimeService  {

	/**
	 * 查询快捷当天的交易金额
	 * @param para 参数值，必须有交易时间和银行卡号
	 * @return 交易金额合计值
	 * @throws BusinessException 异常处理
	 */
	BigDecimal queryDayTradeMoneyLimit(Map<String ,Serializable> para)throws BusinessException;
}
