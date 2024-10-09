package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.Dish;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DishMapper {

    @Select("select count(id) from sky_take_out.dish where category_id = #{categoryId}")
    public Integer countDishByCategoryId(Long id);

    @AutoFill(value = OperationType.INSERT)
    public void insert(Dish dish);
}
