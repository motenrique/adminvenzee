package com.venzee.model;

import com.venzee.helpers.DateHelper;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * Created by antoniohernandez on 7/26/17.
 */
public class Push {


    private String platform;
    private String organizationName;
    private String collectionId;
    private String integrationContextId;
    private int totalProducts;
    private int processedProducts;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;





    public Push(Map<String, Object> pushMap)  {

        platform = (String) pushMap.get("platform");
        organizationName = (String) pushMap.get("orgName");
        collectionId = (String) pushMap.get("collectionId");
        integrationContextId = (String) pushMap.get("integrationContextId");
        totalProducts = (int) pushMap.get("totalProducts");
        processedProducts = (int) pushMap.get("processedProducts");
        dateCreated = DateHelper.getDate((String) pushMap.get("dateCreated"));
        lastUpdated = DateHelper.getDate((String) pushMap.get("lastUpdated"));
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getIntegrationContextID() {
        return integrationContextId;
    }

    public void setIntegrationContextID(String integrationContextId) {
        this.integrationContextId = integrationContextId;
    }

    public int getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(int totalProducts) {
        this.totalProducts = totalProducts;
    }

    public int getProcessedProducts() {
        return processedProducts;
    }

    public void setProcessedProducts(int processedProducts) {
        this.processedProducts = processedProducts;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}