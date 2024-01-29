package com.herkha.obssolutiontest.controller;

import com.herkha.obssolutiontest.entity.Item;
import com.herkha.obssolutiontest.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;
    @PostMapping("/save")
    public Item save(@RequestBody Item item){
        Item result = itemService.save(item);
        return result;
    }
    @PutMapping("/edit/{id}")
    public Boolean edit(@PathVariable Long id,@RequestBody Item item){
        Item result = itemService.findById(id);
        return itemService.edit(id, item);
    }
}
