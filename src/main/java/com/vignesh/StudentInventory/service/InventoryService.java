package com.vignesh.StudentInventory.service;

import com.vignesh.StudentInventory.Entity.Inventory;
import com.vignesh.StudentInventory.error.usernameNotFoundException;
import com.vignesh.StudentInventory.repository.InventoryRepositoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class InventoryService implements InventoryInterface{

    @Autowired
    private InventoryRepositoryInter repo;

    @Override
    public Inventory saveInventory(Inventory inventory) {
        return repo.save(inventory);
    }

    @Override
    public List<Inventory> fetchInventoryList() {
        return repo.findAll();
    }

    @Override
    public Inventory fetchInventoryById(Long userid) throws usernameNotFoundException {
        Optional<Inventory> inventory=repo.findById(userid);

        if(!inventory.isPresent()) {
                throw new usernameNotFoundException("User Name not found");
        }
        return inventory.get();
    }

    @Override
    public void deleteInventoryById(Long userid) {
        repo.deleteById(userid);
    }

    @Override
    public Inventory updateInventory(Long userid, Inventory inventory) {
        Inventory invent=repo.findById(userid).get();

        if(Objects.nonNull(inventory.getStudentname()) &&
                !"".equalsIgnoreCase(inventory.getStudentname())){
            invent.setUsername(inventory.getUsername());
        }
        if(Objects.nonNull(inventory.getStudentname()) &&
                !"".equalsIgnoreCase(inventory.getStudentname())){
            invent.setStudentname(inventory.getStudentname());
        }
        if(Objects.nonNull(inventory.getStudentname()) &&
                !"".equalsIgnoreCase(inventory.getStudentname())){
            invent.setDetails(inventory.getDetails());
        }

        return repo.save(invent);
    }

    @Override
    public Inventory fetchInventoryByName(String studentname) {
        return repo.findByStudentnameIgnoreCase(studentname);
    }

}
