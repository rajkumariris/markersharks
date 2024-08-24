package dev.raj.makersharks.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SupplierDto {
    Long supplier_Id;
    String  company_name;
    String  website;
    String  location;
    String  nature_of_business;
    String   manufacturing_process;
}
