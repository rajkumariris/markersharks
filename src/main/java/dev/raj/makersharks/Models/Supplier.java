package dev.raj.makersharks.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Supplier {
    @Id
    @Column(name = "supplierId", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long supplierId;
    String  companyName;
    String  website;
    String  location;
    String  nature_of_business;
    String   manufacturing_process;
}
