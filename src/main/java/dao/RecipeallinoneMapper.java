package dao;

import dao.Recipeallinone;
import dao.RecipeallinoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecipeallinoneMapper {
    int countByExample(RecipeallinoneExample example);

    int deleteByExample(RecipeallinoneExample example);

    int deleteByPrimaryKey(Integer recipeid);

    int insert(Recipeallinone record);

    int insertSelective(Recipeallinone record);

    List<Recipeallinone> selectByExample(RecipeallinoneExample example);

    Recipeallinone selectByPrimaryKey(Integer recipeid);

    int updateByExampleSelective(@Param("record") Recipeallinone record, @Param("example") RecipeallinoneExample example);

    int updateByExample(@Param("record") Recipeallinone record, @Param("example") RecipeallinoneExample example);

    int updateByPrimaryKeySelective(Recipeallinone record);

    int updateByPrimaryKey(Recipeallinone record);
}