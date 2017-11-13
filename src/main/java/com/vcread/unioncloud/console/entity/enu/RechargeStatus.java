package com.vcread.unioncloud.console.entity.enu;

/**
 * 充值状态
 *
 */
public enum RechargeStatus {

	/**
	 * @Fields toPay :待付款
	 */
	toPay,
	/**
	 * @Fields Success : 充值成功
	 */
	success,
	/**
	 * @Fields Failure : 充值失败
	 */
	failed,
	/**
	 * @Fields Cancel : 订单取消
	 */
	cancel,
}
