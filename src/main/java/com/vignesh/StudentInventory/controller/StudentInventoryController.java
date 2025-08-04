package com.vignesh.StudentInventory.controller;


import com.vignesh.StudentInventory.Entity.Inventory;
import com.vignesh.StudentInventory.error.usernameNotFoundException;
import com.vignesh.StudentInventory.service.InventoryService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentInventoryController {

    @Autowired
    private InventoryService service;


    private final Logger LOGGER=
            LoggerFactory.getLogger(StudentInventoryController.class);

    @PostMapping("/inventory")
    public Inventory saveInventory(@Valid @RequestBody Inventory inventory){
        LOGGER.info("Inside saveInventory of StudentInvenotryController");
        return service.saveInventory(inventory);
    }

    @GetMapping("/inventory")
    public List<Inventory> fetchInventoryList(){
        LOGGER.info("Inside saveInventory of StudentInvenotryController");
        return service.fetchInventoryList();
    }

    @GetMapping("/inventory/{userid}")
    public Inventory fetchInventoryById(@PathVariable("userid") Long userid) throws usernameNotFoundException {
        return service.fetchInventoryById(userid);
    }

    @GetMapping("/inventory/delete/{userid}")
    public String deleteInventoryById(@PathVariable("userid") Long userid){
        service.deleteInventoryById(userid);
        return "Inventory Deleted Successfully";
    }

    @PutMapping("/inventory/update/{userid}")
    public Inventory updateInventory(@PathVariable("userid") Long userid,@RequestBody Inventory inventory){
        return service.updateInventory(userid,inventory);
    }

    @GetMapping("/inventory/name/{name}")
    public Inventory fetchInventoryByName(@PathVariable("name") String studentname){
        return service.fetchInventoryByName(studentname);
    }
}
