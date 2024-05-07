package com.ronaldo.springboot.di.factura.springbootdifactura.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Product product;
    private Integer quantity;

    public int getImporte () {
        return quantity * product.getPrice();
    }

}
