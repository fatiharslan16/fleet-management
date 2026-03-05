package com.company.asset;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Asset{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String assetId;
    private String name;
    private String category;
    private String status;

    public Asset() {} // if you never add any constructor, java provides one, otherwise you need to

    public Asset(String assetId, String name) {
        this.assetId = assetId;
        this.name = name;
    }

    public String getAssetId() { return assetId; }
    public void setAssetId(String assetId) { this.assetId = assetId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }    


}




// encapsulation: class variables and attributes are private
// public getter and setter tu update private variables