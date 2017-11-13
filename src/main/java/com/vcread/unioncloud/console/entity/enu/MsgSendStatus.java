package com.vcread.unioncloud.console.entity.enu;

/**
 * 短信发送状态
 */
public enum MsgSendStatus {

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
     * @Fields sendSuccessfully :发送成功
     */
    success,
    /**
     * @Fields sendFailed :发送失败
     */
    failed,


}
