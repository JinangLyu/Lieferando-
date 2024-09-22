package com.sky.mapper;

import com.sky.entity.Setmeal;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SetMealMapper {

    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    public Integer countByCategoryId(Long id);


}
