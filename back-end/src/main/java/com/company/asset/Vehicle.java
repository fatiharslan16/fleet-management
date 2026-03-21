package com.company.asset;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Vehicle{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String vehicleId;
    private String status;
    private Integer odometer;
    private Double accumulatedCost;
    private Double initialCost;
    private LocalDate warrantyExpiration;
    private LocalDate dateAdded;

    // Constructors
    public Vehicle() {}

    public Vehicle(Double initialCost, LocalDate dateAdded) {
        this.initialCost = initialCost; // default cost if not specified
        this.dateAdded = LocalDate.now();
    }

    // Getters & Setters
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleId() {
        return vehicleId; 
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status; 
    }

    public void setOdometer(Integer odometer) {
        this.odometer = odometer;
    }

    public Integer getOdometer() {
        return odometer; 
    }

    public void setAccumulatedCost(Double accumulatedCost) {
        this.accumulatedCost = accumulatedCost;
    }

    public Double getAccumulatedCost() {
        return accumulatedCost; 
    }

    public void setInitialCost(Double initialCost) {
        this.initialCost = initialCost;
    }

    public Double getInitialCost() {
        return initialCost; 
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setWarrantyExpiration(LocalDate warrantyExpiration) {
        this.warrantyExpiration = warrantyExpiration;
    }

    public LocalDate getWarrantyExpiration() {
        return warrantyExpiration;
    }
    


}