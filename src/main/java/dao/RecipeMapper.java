package dao;

import dao.Recipe;
import dao.RecipeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecipeMapper {
    int countByExample(RecipeExample example);

    int deleteByExample(RecipeExample example);

    int deleteByPrimaryKey(Integer recipeid);

    int insert(Recipe record);

    int insertSelective(Recipe record);

    List<Recipe> selectByExample(RecipeExample example);

    Recipe selectByPrimaryKey(Integer recipeid);

    int updateByExampleSelective(@Param("record") Recipe record, @Param("example") RecipeExample example);

    int updateByExample(@Param("record") Recipe record, @Param("example") RecipeExample example);

    int updateByPrimaryKeySelective(Recipe record);

    int updateByPrimaryKey(Recipe record);
}