package com.jd.demo.common;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * <p>
 * Title:项目时间处理的工具类
 * </p>
 * <p>
 * Description: 项目中常用的时间处理的工具辅助类
 * </p>
 * <p>
 * Company: ChinaBank
 * </p>
 * 
 *  UnixTimeStampUtil
 * @author  wywangyong
 * @version 1.0.0
 */
public abstract class UnixTimeStampUtil {

	/**
	 * 
	 * <p>
	 * Description:秒滑动
	 * </p>
	 * 
	 * @param second
	 *            秒数
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long slideSecond(int second) {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, second);

		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description:向前滑动秒数
	 * </p>
	 * 
	 * @param second
	 *            秒数
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long slideBeforeSecond(int second) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, -second);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description:小时滑动
	 * </p>
	 * 
	 * @param hour
	 *            滑动的小时
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long slideHour(int hour) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, hour);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description:向前滑动的小时数
	 * </p>
	 * 
	 * @param hour
	 *            小时数
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long slideBeforeHour(int hour) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -hour);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 向后滑动的分钟数
	 * </p>
	 * 
	 * @param minute
	 *            分钟数
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long slideMinute(int minute) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, minute);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 向前滑动的分钟数
	 * </p>
	 * 
	 * @param minute
	 *            分钟数
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long slideBeforeMinute(int minute) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, -minute);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 泛指滑动的小时、分钟、秒
	 * </p>
	 * 
	 * @param hour
	 *            小时值 可正可负
	 * @param minute
	 *            分钟值 可正可负
	 * @param second
	 *            秒值 可正可负
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long slideHourMinuteAndSecond(int hour, int minute, int second) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, hour);
		calendar.add(Calendar.MINUTE, minute);
		calendar.add(Calendar.SECOND, second);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 当前的零点值
	 * </p>
	 * 
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long curDateZeroMills() {

		Calendar curDate = Calendar.getInstance();
		Calendar curZeroDate = Calendar.getInstance();
		curZeroDate.set(curDate.get(Calendar.YEAR),
				curDate.get(Calendar.MONTH), curDate.get(Calendar.DATE), 0, 0,
				0);
		return curZeroDate.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 某天的零点值
	 * </p>
	 * 
	 * @param date
	 *            具体的某一天
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long dateZeroMills(Date date) {

		Calendar curDate = Calendar.getInstance();
		curDate.setTime(date);
		Calendar calendar = Calendar.getInstance();
		calendar.set(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH),
				curDate.get(Calendar.DATE), 0, 0, 0);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 某天的24点值
	 * </p>
	 * 
	 * @param date
	 *            具体的某一天
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long date24Mills(Date date) {
		Calendar curDate = Calendar.getInstance();
		curDate.setTime(date);
		Calendar calendar = Calendar.getInstance();
		calendar.set(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH),
				curDate.get(Calendar.DATE), 23, 59, 59);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 某天的0点值
	 * </p>
	 * 
	 * @param dateMills
	 *            具体的某一天的UTC milliseconds 值
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long dateZeroMills(long dateMills) {
		Calendar curDate = Calendar.getInstance();
		curDate.setTimeInMillis(dateMills);
		Calendar calendar = new GregorianCalendar(curDate.get(Calendar.YEAR),
				curDate.get(Calendar.MONTH), curDate.get(Calendar.DATE), 0, 0,
				0);

		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 某天的24点值
	 * </p>
	 * 
	 * @param dateMills
	 *            具体的某一天的UTC milliseconds 值
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long date24Mills(long dateMills) {
		Calendar curDate = Calendar.getInstance();
		curDate.setTimeInMillis(dateMills);
		Calendar calendar = Calendar.getInstance();
		calendar.set(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH),
				curDate.get(Calendar.DATE), 23, 59, 59);

		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 某天所在月的月初的0点值
	 * </p>
	 * 
	 * @param date
	 *            具体的某一天
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long monthFirstMills(Date date) {
		Calendar curDate = Calendar.getInstance();
		curDate.setTime(date);
		Calendar calendar = Calendar.getInstance();
		calendar.set(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH),
				0, 0, 0, 0);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 某天所在月的月初的24点值
	 * </p>
	 * 
	 * @param date
	 *            具体的某一天
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long monthLastMills(Date date) {
		Calendar curDate = Calendar.getInstance();
		curDate.setTime(date);
		int month_of_last_day = curDate.getActualMaximum(Calendar.DAY_OF_MONTH);
		Calendar calendar = Calendar.getInstance();

		calendar.set(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH),
				month_of_last_day, 23, 59, 59);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 某天所在月的月初的24点值
	 * </p>
	 * 
	 * @param date
	 *            具体的某一天的UTC milliseconds 值
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long monthFirstMills(long date) {
		Calendar curDate = Calendar.getInstance();
		curDate.setTimeInMillis(date);
		Calendar calendar = Calendar.getInstance();
		calendar.set(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH),
				0, 0, 0, 0);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description: 某天所在月的月末的24点值
	 * </p>
	 * 
	 * @param date
	 *            具体的某一天的UTC milliseconds 值
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long monthLastMills(long date) {
		Calendar curDate = Calendar.getInstance();
		curDate.setTimeInMillis(date);
		int month_of_last_day = curDate.getActualMaximum(Calendar.DAY_OF_MONTH);
		Calendar calendar = Calendar.getInstance();

		calendar.set(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH),
				month_of_last_day, 23, 59, 59);

		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description:在某天的的交易时间上滑动滑动小时
	 * </p>
	 * 
	 * @param date
	 *            交易时间
	 * @param hour
	 *            可正可负 表示向前或者向后
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long slideHourMills(long date, int hour) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(date);

		calendar.add(Calendar.HOUR, hour);
		return calendar.getTimeInMillis();
	}

	/**
	 * 
	 * <p>
	 * Description:在交易时间的基础上滑动分钟
	 * </p>
	 * 
	 * @param date
	 *            交易时间
	 * @param min
	 *            分钟
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long slideMinMills(long date, int min) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(date);

		calendar.add(Calendar.HOUR, min);
		return calendar.getTimeInMillis();
	}
	
	/**
	 * <p>Description:年初时间 </p>
	 * @param date Java UnixTs
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long yearFirstMills(long date) {
		Calendar curDate = Calendar.getInstance();
		curDate.setTimeInMillis(date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(curDate.get(Calendar.YEAR), 0,
				0, 0, 0, 0);
		return calendar.getTimeInMillis();
	}
	
	/**
	 * <p>Description: 年末时间</p>
	 * @param date Java UnixTs
	 * @return long类型的数据(Java UnixTs)
	 */
	public static long yearLastMills(long date) {
		Calendar curDate = Calendar.getInstance();
		curDate.setTimeInMillis(date);
		int month_of_last_day = curDate.getActualMaximum(Calendar.DAY_OF_MONTH);
		int year_of_last_month = curDate.getActualMaximum(Calendar.MONTH);
		Calendar calendar = Calendar.getInstance();

		calendar.set(curDate.get(Calendar.YEAR), year_of_last_month,
				month_of_last_day, 23, 59, 59);

		return calendar.getTimeInMillis();
	}
	
}
