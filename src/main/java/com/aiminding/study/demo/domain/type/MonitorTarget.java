package com.aiminding.study.demo.domain.type;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public enum MonitorTarget {
    UNKNOWN("未知"),
    AD("广告数"),
    AD_GS("广告数"), // 基于gs数据的监控，数据能力不一致，没法完全替代
    CREATIVE("素材数"),
    NEW_CUSTOMER_EFFECTIVE_VALUE("新客有效值"),
    NEW_CUSTOMER_EFFECTIVE_VALUE_V2("新客有效值"), // 基于接口
    RECHARGE_AMOUNT("充值金额"),
    RECHARGE_AMOUNT_V2("充值金额"), // 基于接口
    COST_AMOUNT("账户消耗"),
    COST_AMOUNT_RS("账户消耗");

    private final String desc;

    MonitorTarget(String desc) {
        this.desc = desc;
    }

    public static MonitorTarget fromString(String monitorTarge) {
        for (MonitorTarget mt : MonitorTarget.values()) {
            if (StringUtils.equalsIgnoreCase(monitorTarge, mt.name())) {
                return mt;
            }
        }
        return UNKNOWN;
    }
}
