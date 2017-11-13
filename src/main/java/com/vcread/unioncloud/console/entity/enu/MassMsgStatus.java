package com.vcread.unioncloud.console.entity.enu;

/**
 * 群发短信状态
 */
public enum MassMsgStatus {

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
    /**
     * @Fields toSend :待发送
     */
    toSend,
    /**
     * @Fields sending :发送中
     */
    sending,
    /**
     * @Fields sent :已发送
     */
    sent,
    /**
     * @Fields success : 发送成功
     */
    success,// 发送成功
    /**
     * @Fields failed :发送失败
     */
    failed, // 发送失败


}
