package com.company.asset;

public class IdGenerator {
    
    public String generateBusinessId(Long id, String category){

        if (id == null) {
            throw new IllegalArgumentException("Id is null, but needed for businessId");
        }

        if ( category == null || category.isBlank()) {
            throw new IllegalArgumentException("Category is null or blank, but needed for businessId");
        }

        // handle null pointer exception
        String dbId = Long.toString(id);
        String businessId = category.toUpperCase() + "-" + dbId;
        return businessId;
    }

}
