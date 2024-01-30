package com.herkha.obssolutiontest.service;

import com.herkha.obssolutiontest.entity.Item;
import com.herkha.obssolutiontest.messageDTO.ItemDTO;

import java.util.List;

public interface ItemService {
    Item get(Long id);
    List<Item> findAll();
    Item save(Item item);
    Boolean delete(Long id);
    Boolean edit(Long id, Item item);
    Item findById(Long id);
    ItemDTO mapItemToDTO(Item item);
    Item mapItemDTOItem(ItemDTO itemDTO);
}
