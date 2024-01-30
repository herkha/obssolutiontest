package com.herkha.obssolutiontest.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.herkha.obssolutiontest.entity.Item;
import com.herkha.obssolutiontest.messageDTO.ItemDTO;
import com.herkha.obssolutiontest.repository.ItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService{
    @Autowired
    ItemRepository itemRepository;
    @Override
    public Item get(Long Id) {
        Optional<Item> result = itemRepository.findById(Id);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }

    @Override
    public List<Item> findAll() {
        List<Item> result = itemRepository.findAll();

        return result;
    }

    @Override
    public Item findById(Long id) {
        return null;
    }

    @Override
    public Item save(Item item) {
        return null;

    }

    @Override
    public Boolean delete(Long id) {
        Optional<Item> result = itemRepository.findById(id);
        if (result.isPresent()) {
            itemRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Boolean edit(Long id, Item item) {
        Optional<Item> result = itemRepository.findById(id);
        if (result.isPresent()) {
            item.setName(result.get().getName());
            itemRepository.save(item);
            return true;
        }
        return false;
    }

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public ItemDTO mapItemToDTO(Item item) {
        return mapper.convertValue(item, ItemDTO.class);
    }

    @Override
    public Item mapItemDTOItem(ItemDTO itemDTO) {
       return mapper.convertValue(itemDTO, Item.class);
    }
}
