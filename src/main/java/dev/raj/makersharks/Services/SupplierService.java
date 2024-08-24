package dev.raj.makersharks.Services;

import dev.raj.makersharks.Dtos.SupplierDto;
import dev.raj.makersharks.Models.Supplier;
import dev.raj.makersharks.Repositories.SupplierRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {


    @Autowired
    SupplierRepository supplierRepository;
    public Page<Supplier> getSupplier(SupplierDto supplier, int page){

        Supplier supplierModel = new Supplier();
        //BeanUtils.copyProperties(supplier, supplierModel);
        supplierModel.setCompanyName(supplier.getCompany_name());
        supplierModel.setWebsite(supplier.getWebsite());
        supplierModel.setLocation(supplier.getLocation());
        supplierModel.setNature_of_business(supplier.getNature_of_business());
        supplierModel.setManufacturing_process(supplier.getManufacturing_process());
        ExampleMatcher matcher = ExampleMatcher.matchingAll();
        Example<Supplier> example = Example.of(supplierModel, matcher);


//fetching with long query
//        Page<Supplier> reponse = supplierRepository.findByCompanyNameAndLocationAndAndSupplierIdAndAndNature_of_businessAndAndWebsiteAndAndManufacturing_processAndCompanyNameContains(
//                supplierModel.getCompanyName(),
//               supplierModel.getLocation(),
//                supplierModel.getSupplierId(),
//                supplierModel.getNature_of_business(),
//               supplierModel.getWebsite(),
//                supplierModel.getManufacturing_process(),
//                supplierModel.getCompanyName(),
//                PageRequest.of(page, nu
//                mofsuuplier));

        Page<Supplier> reponse = supplierRepository.findAll(example, PageRequest.of(0, 1));
        return reponse;
    }
    public SupplierDto createSupplier(SupplierDto supplier){
        Supplier supplierModel = new Supplier();
        supplierModel.setCompanyName(supplier.getCompany_name());
        supplierModel.setWebsite(supplier.getWebsite());
        supplierModel.setLocation(supplier.getLocation());
        supplierModel.setNature_of_business(supplier.getNature_of_business());
        supplierModel.setManufacturing_process(supplier.getManufacturing_process());
        supplierRepository.save(supplierModel);
        return supplier;
    }
    public List<Supplier> getSupplierall(String name){

        List<Supplier> SupplierList = supplierRepository.findAllByCompanyName(name);
        return SupplierList;
    }
}
