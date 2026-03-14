# Domain Model

## Overview

Fleet operations depend on keeping vehicles available, controlling maintenance time, and managing total operating cost. These decisions increasingly rely on operational data such as mileage, engine temperature, fuel consumption, diagnostic codes, and maintenance history. Unlike many fleet tools that primarily display reports and dashboards, this system is designed to support predictive analysis of vehicle metrics so problems can be identified before a breakdown occurs.

-----------------------------

## Entity: VEHICLE

**Description**

Vehicle represents a human-driven fleet unit.

## **Responsibilities**

* represents a physical unit in the fleet
* keep track of its current state
* connect the unit with maintenance history and data

## **Key Data**

* vehicleId 
* bodyType
* status
* odometer
* usageUnit
* initialCost
* accumulatedCost
* dateAdded
* age
* warrantyExpiration
* currentValue
* retireCondition

## **Relationships**

* an vehicle may be assigned to an driver
* an vehicle can have many maintenance records
* an vehicle can have many usage metrics

-----------------------------

## Entity: DRIVER

**Description**

A licensed person operates non-autonomous vehicles or use tools.

## **Responsibilities**

* operates vehicles
* reports condition of vehicles

## **Key Data**

* driverId
* name
* lastName
* licenses

## **Relationships**

* can be assigned a vehicle

## Notes

Driver behaviour will be considered as part of predictive maintanence analysis in the future.

-----------------------------

## Entity: MAINTENANCE

**Description**

Maintenance represents a single service, inspection, or repair event for a vehicle. Each record stores one maintenance action in the vehicle’s history.

## **Responsibilities**

* record a maintenance event for a vehicle
* store whether the work is scheduled, in progress, or completed
* help track vehicle condition and service history over time

## **Key Data**

* maintenanceId
* vehicleId
* type
* status
* scheduledDate
* completedDate
* notes
* cost

## **Relationships**

* belongs to one vehicle

## Notes

Design decisions, assumptions, or future considerations.

-----------------------------

# Entity: METRICS

**Description**

Metric represents data collected from a vehicle during operation. These measurements help monitor vehicle health and support early detection of mechanical issues.

## **Responsibilities**

* store measurements from a vehicle
* provide data for predictive analysis

## **Key Data**

* metricId
* vehicleId
* metricType
* value
* unit
* recordedAt

## **Relationships**

* belongs to one vehicle
* may be analyzed to trigger preventive maintenance

## Notes



