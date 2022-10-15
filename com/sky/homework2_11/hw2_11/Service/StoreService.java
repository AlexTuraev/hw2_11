package com.sky.homework2_11.hw2_11.Service;

import com.sky.homework2_11.hw2_11.store.Store;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Scope(scopeName = "prototype")
public class StoreService {

    private final Store store;

    public StoreService(Store store) {
        this.store = store;
    }

    public String add(String id)
    {
        String [] strIds = id.split(",");
        Arrays.stream(strIds).forEach(e -> {
            if (StringUtils.isNumeric(e)) {
                store.addId(e);
            }else {
                throw new RuntimeException("Переданы невалидные данные. Должны быть целочисленные id, разделенные ','");
            }
        });


        return ("Id товаров добавлены в корзину. Список добавленных Id: " + id);
    }

    public List get() {
        return store.getAllId();
    }
}
