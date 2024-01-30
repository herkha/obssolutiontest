package com.herkha.obssolutiontest.controller;

import com.herkha.obssolutiontest.entity.Item;
import com.herkha.obssolutiontest.messageDTO.ItemDTO;
import com.herkha.obssolutiontest.service.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;
    @PostMapping("/save")
    public Item save(@RequestBody ItemDTO request){
        Item item = itemService.mapItemDTOItem(request);
        Item result = itemService.save(item);
        return result;
    }
    @PutMapping("/edit/{id}")
    public Boolean edit(@PathVariable Long id,@RequestBody Item item){
        Item result = itemService.findById(id);
        
        return itemService.edit(result.getId(), item);
    }

    @GetMapping("/list/")
    public List<Item> list(){
       
        
        return itemService.findAll().stream().toList();
    }
}
