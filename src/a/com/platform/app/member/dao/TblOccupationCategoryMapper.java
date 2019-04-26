package com.platform.app.member.dao;

import com.platform.app.member.vo.TblOccupationCategory;
import com.platform.app.member.vo.TblOccupationCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblOccupationCategoryMapper {
    long countByExample(TblOccupationCategoryExample example);

    int deleteByExample(TblOccupationCategoryExample example);

    int insert(TblOccupationCategory record);

    int insertSelective(TblOccupationCategory record);

    List<TblOccupationCategory> selectByExample(TblOccupationCategoryExample example);

    int updateByExampleSelective(@Param("record") TblOccupationCategory record, @Param("example") TblOccupationCategoryExample example);

    int updateByExample(@Param("record") TblOccupationCategory record, @Param("example") TblOccupationCategoryExample example);
}