package com.ronaldo.springboot.di.factura.springbootdifactura.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.springboot.di.factura.springbootdifactura.models.Invoice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show() {
        return invoice;
    }
}
