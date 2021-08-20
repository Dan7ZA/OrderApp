package com.appyflows.OrderApp.controller;

import com.appyflows.OrderApp.model.MenuItem;
import com.appyflows.OrderApp.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/menu")
    public ResponseEntity<List<MenuItem>> getAllMenuItems(){
        List<MenuItem> menuItems = menuService.getAllMenuItems();
        return new ResponseEntity<List<MenuItem>>(menuItems, HttpStatus.OK);
    }


}

