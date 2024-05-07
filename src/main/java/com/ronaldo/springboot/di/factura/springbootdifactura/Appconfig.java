package com.ronaldo.springboot.di.factura.springbootdifactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ronaldo.springboot.di.factura.springbootdifactura.models.Item;
import com.ronaldo.springboot.di.factura.springbootdifactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class Appconfig {

    @Bean
    List<Item> itemInvoice () {
        Product p1 = new Product("xbox one", 1200);
        Product p2 = new Product("ps5", 1800);
        return Arrays.asList(new Item(p1, 4), new Item(p2,2)) ;
    }

}
