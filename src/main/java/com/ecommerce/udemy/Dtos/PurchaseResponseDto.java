package com.ecommerce.udemy.Dtos;

public class PurchaseResponseDto {
    private String orderTrackingNumber;

    public PurchaseResponseDTO(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }
}