package dev.raj.makersharks.Controllers;

import dev.raj.makersharks.Dtos.SupplierDto;
import dev.raj.makersharks.Exceptions.SupplierNotFound;
import dev.raj.makersharks.Models.Supplier;
import dev.raj.makersharks.Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;
    @PostMapping ("/query/{pageNo}")
    public Optional<Page<Supplier>>  getSupplier(@RequestBody SupplierDto supplier, @PathVariable("pageNo") int pageNo) throws SupplierNotFound {
//       return new ResponseEntity<>(
               Page<Supplier> result = supplierService.getSupplier(supplier, pageNo);

               if(result.getContent().size() <=0){
                   throw new SupplierNotFound();
               }
               return Optional.of(result);
    }
    @GetMapping("/{name}")
    public List<Supplier> getSupplierall(@PathVariable String name){
        return supplierService.getSupplierall(name);
    }



    @PostMapping("/CreateSupplier")
    public SupplierDto createSupplier(@RequestBody SupplierDto supplier){
        return supplierService.createSupplier(supplier);
    }

}
