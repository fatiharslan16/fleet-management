# Domain Model

## Overview

Fleet operations depend on keeping vehicles available, controlling maintenance time, and managing total operating cost. These decisions increasingly rely on operational data such as mileage, engine temperature, fuel consumption, diagnostic codes, and maintenance history. Unlike many fleet tools that primarily display reports and dashboards, this system is designed to support predictive analysis of vehicle metrics so problems can be identified before a breakdown occurs.

---

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
* retireCondition

## **Relationships**

* an vehicle may be assigned to an driver
* an vehicle can have many maintenance records
* an vehicle can have many usage metrics

---

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

* may drive a vehicle

---

## Notes

Driver behaviour will be considered as part of predictive maintanence analysis in the future.

---

## Entity: MAINTENANCE

**Description**
What this entity represents.

## **Responsibilities**

*
*

## **Key Data**

*
*

## **Relationships**

*

---

## Notes

Design decisions, assumptions, or future considerations.

# Entity: METRICS

**Description**
What this entity represents.

## **Responsibilities**

*
*

## **Key Data**

*
*

## **Relationships**

*

---

## Notes

Design decisions, assumptions, or future considerations.


