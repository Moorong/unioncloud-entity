package com.vcread.unioncloud.console.entity.enu;

/**
 * 业务类型
 */
public enum BusinessType {

    /**
     * @Fields msgTemplate : 短信模板
     */
    msgTemplate,
    /**
     * @Fields massMsg : 群发短信
     */
    massMsg,
    /**
     * @Fields voiceCodePrice : 语音验证码
     */
    voiceCode,
    /**
     * @Fields voiceCall : 语音通话
     */
    voiceCall,
    /**
     * @Fields voiceNotice : 语音通知
     */
    voiceNotice,
    /**
     * @Fields traffic : 流量分发
     */
    traffic,
    /**
     * @Fields teleConference : 电话会议
     */
    teleConference,
    /**
     * @Fields numberDefender : 安全号码
     */
    numberDefender;

    public static BusinessType of(String type) {
        switch (type) {
            case "msgTemplate":
                return msgTemplate;
            case "massMsg":
                return massMsg;
            case "voiceCodePrice":
                return voiceCode;
            case "voiceCall":
                return voiceCall;
            case "voiceNotice":
                return voiceNotice;
            case "traffic":
                return traffic;
            case "numberDefender":
                return numberDefender;
                case "teleConference":
                return teleConference;
            default:
                return null;
        }
    }
}
