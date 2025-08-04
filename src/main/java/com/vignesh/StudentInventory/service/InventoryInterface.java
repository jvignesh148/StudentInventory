package com.vignesh.StudentInventory.service;

import com.vignesh.StudentInventory.Entity.Inventory;
import com.vignesh.StudentInventory.error.usernameNotFoundException;

import java.util.List;


public interface InventoryInterface {
    public Inventory saveInventory(Inventory inventory);

    public List<Inventory> fetchInventoryList();

    public Inventory fetchInventoryById(Long userid) throws usernameNotFoundException;

    public void deleteInventoryById(Long userid);

    public Inventory updateInventory(Long userid, Inventory inventory);

    public Inventory fetchInventoryByName(String studentname);
}
