package com.vignesh.StudentInventory.repository;

import com.vignesh.StudentInventory.Entity.Inventory;
import com.vignesh.StudentInventory.StudentInventoryApplication;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepositoryInter extends JpaRepository<Inventory,Long> {
    public Inventory findByStudentname(String studentname);
    public Inventory findByStudentnameIgnoreCase(String studentname);
}
