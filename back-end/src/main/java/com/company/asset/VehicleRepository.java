package com.company.asset;

import java.util.Optional;
import org.springframework.data.repository.Repository;

// tells Spring to generate database operations automatically
// access modifiers control where the interface can be used
// public -> usable from any package in the application
// default -> only inside the same package
public interface VehicleRepository extends Repository<Vehicle , Long>{ 

    VehicleRepository save(Vehicle asset);
    Optional<VehicleRepository> findById(long id);
    
}