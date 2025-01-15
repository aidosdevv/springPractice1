package com.spiringboot.lecture;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {



    @GetMapping(value = "/index")
    public String indexPage(Model model) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1L,"Macbook Pro","8 GB RAM 256 GB SSD Inter Core i7",1199.99));
        items.add(new Item(2L,"Mac Book Pro","16 GB RAM 500 GB SSD Apple M1",1499.99));
        items.add(new Item(3L,"Mac Book Pro","16 GB RAM 1GB SSD Apple M1",1799.99));
        items.add(new Item(4L,"ASUS Tuf Gaming","16 GB 500 GB SSD Intel Core i7",1299.99));
        items.add(new Item(5L,"HP Laser Pro","8 GB RAM 500 GB SSD Intel Core i5",999.99));
        items.add(new Item(6L,"Lenovo Legion","32 GB RAM 512 GB SSD Intel Core i7",1399.99));
        model.addAttribute("products", items);

        return "index";
    }
}
