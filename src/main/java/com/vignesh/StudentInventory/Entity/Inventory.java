package com.vignesh.StudentInventory.Entity;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inventory {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;

    @NotBlank(message = "Please Add User Name")
    @Length(max=20, min=1)
    private String username;
    private String studentname;
    private List<String> details;



}
