package com.lwx.dto;

/**
 * @author zeus
 * @date 2025/11/8 22
 * @description:
 */
public enum OrderStatus {
    PENDING(0, "Pending approval"),
    APPROVED(1, "Approved"),
    REJECTED(2, "Rejected"),
    SHIPPED(3, "Order shipped");

    private final int code;
    private final String description;

    OrderStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static OrderStatus fromCode(int code) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.code == code) {
                return status;
            }
        }
        System.out.println("hhhhh");
        throw new IllegalArgumentException("Unknown code: " + code);
    }
}
