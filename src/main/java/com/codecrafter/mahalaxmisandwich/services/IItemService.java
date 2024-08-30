package com.codecrafter.mahalaxmisandwich.services;

import com.codecrafter.mahalaxmisandwich.entities.Item;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IItemService {

    Item addItem(Item item, MultipartFile file) throws IOException;

    List<Item> getAllItems();

    Item getItemById(Item item);

    Item deleteItem(Long itemId);

    Item updateItem(Item item,MultipartFile file) throws IOException;
}
