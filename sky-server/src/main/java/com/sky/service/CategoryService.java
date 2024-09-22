package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    void update(CategoryDTO categoryDTO);

//    List<Category> list(Integer type);

    PageResult page(CategoryPageQueryDTO categoryPageQueryDTO);

    void post(CategoryDTO categoryDTO);

    void delete(Long id);

    void switchStatus(Integer status, Long id);
}
