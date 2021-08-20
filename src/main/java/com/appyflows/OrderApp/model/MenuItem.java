package com.appyflows.OrderApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MENU_ITEM")
public class MenuItem {

    @Id
    @GeneratedValue
    private Long menuItemId;
    private String menuItemName;
    private String menuItemCategory; //will change this to an ENUM at some point (drinks, starters, mains, desserts)
    private String menuItemShortDescription;
    private String menuItemLongDescription;
    private Double menuItemPrice; //will change this to a Price object (currency + amount) at some point
    private String menuItemVegClassification; //will change this to an ENUM at some point (meat, vegetarian, vegan)


    //Constructors
    public MenuItem() {
    }

    public MenuItem(Long menuItemId, String menuItemName, String menuItemCategory, String menuItemShortDescription, String menuItemLongDescription, Double menuItemPrice, String menuItemVegClassification) {
        this.menuItemId = menuItemId;
        this.menuItemName = menuItemName;
        this.menuItemCategory = menuItemCategory;
        this.menuItemShortDescription = menuItemShortDescription;
        this.menuItemLongDescription = menuItemLongDescription;
        this.menuItemPrice = menuItemPrice;
        this.menuItemVegClassification = menuItemVegClassification;
    }

    //Getters & setters


    public Long getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(Long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public String getMenuItemCategory() {
        return menuItemCategory;
    }

    public void setMenuItemCategory(String menuItemCategory) {
        this.menuItemCategory = menuItemCategory;
    }

    public String getMenuItemShortDescription() {
        return menuItemShortDescription;
    }

    public void setMenuItemShortDescription(String menuItemShortDescription) {
        this.menuItemShortDescription = menuItemShortDescription;
    }

    public String getMenuItemLongDescription() {
        return menuItemLongDescription;
    }

    public void setMenuItemLongDescription(String menuItemLongDescription) {
        this.menuItemLongDescription = menuItemLongDescription;
    }

    public Double getMenuItemPrice() {
        return menuItemPrice;
    }

    public void setMenuItemPrice(Double menuItemPrice) {
        this.menuItemPrice = menuItemPrice;
    }

    public String getMenuItemVegClassification() {
        return menuItemVegClassification;
    }

    public void setMenuItemVegClassification(String menuItemVegClassification) {
        this.menuItemVegClassification = menuItemVegClassification;
    }
}
