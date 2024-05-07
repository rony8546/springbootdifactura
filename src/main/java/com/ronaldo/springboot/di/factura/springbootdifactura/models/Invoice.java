package com.ronaldo.springboot.di.factura.springbootdifactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description}")
    private String description;

    @Autowired
    private List<Item> items;

    public int getTotal () {
        /*int total = 0;                  usando el motodo foreach para sumar el total del invoice
        for (Item item2 : item) {
            total += item2.getImporte(); // Fixed the method call to item2.getImporte()
        }*/
        return items.stream()              //usando el api stream de java para sumar el total del invoice
        .map(item -> item.getImporte())
        .reduce(0, (sum, item) -> sum + item);
        
    }

}
