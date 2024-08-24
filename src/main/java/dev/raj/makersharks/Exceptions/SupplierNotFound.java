package dev.raj.makersharks.Exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "Supplier not found")
public class SupplierNotFound  extends Exception{
    public SupplierNotFound(){

    }
}
