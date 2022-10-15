package com.sky.homework2_11.hw2_11.RestController;

import com.sky.homework2_11.hw2_11.Service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") String id) {
        try {
            return storeService.add(id);
        } catch (Exception e) {
            return e.getMessage();
        }

    }

    @GetMapping("get")
    public List get() {
        return storeService.get();
    }
}
