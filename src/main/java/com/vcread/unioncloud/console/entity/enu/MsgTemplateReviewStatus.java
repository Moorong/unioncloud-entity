package com.vcread.unioncloud.console.entity.enu;

/**
 * 短信模板审核状态
 *
 */
public enum MsgTemplateReviewStatus {

	/**
	 * @Fields toReview :待审核
	 */
	toReview,
	/**
	 * @Fields approved :已通过
	 */
	approved,
	/**
	 * @Fields disapproved :已驳回
	 */
	disapproved,

	/**
	 * @Fields deleted :已删除
	 */
	deleted,
}
