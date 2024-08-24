package dev.raj.makersharks.Repositories;

//import jakarta.persistence.criteria.CriteriaBuilder;

import dev.raj.makersharks.Models.Supplier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Supplier save(Supplier supplier);
    List<Supplier>  findAllByCompanyName(String name);

}
