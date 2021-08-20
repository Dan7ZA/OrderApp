package com.appyflows.OrderApp.service;

import com.appyflows.OrderApp.model.MenuItem;
import com.appyflows.OrderApp.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItems(){
        return menuItemRepository.findAll();
    }
}
