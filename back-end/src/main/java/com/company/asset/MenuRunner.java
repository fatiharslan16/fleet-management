package com.company.asset;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Scanner;

/* Developers often use it for initialization tasks, 
such as setting up default data,
 executing startup scripts, or 
 performing sanity checks.
 When a class implementing CLR or AR, is marked wthi @Component
 its detected during component scaning. Spring identifies them based on 
 interface implementation.

 In spring:
 you declare the reference,

Spring creates the object,

Spring assigns it to that reference automatically.
 */
@Component
public class MenuRunner implements CommandLineRunner{

    private final Scanner scanner = new Scanner(System.in);
    private final AssetRepository assetRepository;

    public MenuRunner(AssetRepository assetRepository){
        this.assetRepository = assetRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Enter asset name:");
        String assetName = scanner.nextLine();
        
        Asset asset = new Asset();
        asset.setName(assetName);
        
        assetRepository.save(asset);
        System.out.println("Asset saved with ID: " + asset.getAssetId());

        System.out.println("Enter asset id:");
        Long assetId = scanner.nextLong();
        
        System.out.println("Asset ID is:" + assetRepository.findById(assetId));

    }

    



}