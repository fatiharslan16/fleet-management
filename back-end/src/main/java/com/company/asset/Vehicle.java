package com.company.asset;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String vehicleId;
    private String status;
    private Integer odometer;
    private String usageUnit;
    private final Double initialCost;
    private double accumulatedCost;
    private Boolean retireCondition;
    // private Date dateAdded;

    public Vehicle() {
        initialCost = 0.0;
    }

    public Vehicle(String vehicleId, Double initialCost) {
        this.vehicleId = vehicleId;
        this.initialCost = initialCost;
    }

}