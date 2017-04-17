package com.kuyun.bamboo.mapper;

import com.kuyun.bamboo.module.TbFtpFile;
import com.kuyun.bamboo.module.TbFtpFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFtpFileMapper {
    long countByExample(TbFtpFileExample example);

    int deleteByExample(TbFtpFileExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbFtpFile record);

    int insertSelective(TbFtpFile record);

    List<TbFtpFile> selectByExample(TbFtpFileExample example);

    TbFtpFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbFtpFile record, @Param("example") TbFtpFileExample example);

    int updateByExample(@Param("record") TbFtpFile record, @Param("example") TbFtpFileExample example);

    int updateByPrimaryKeySelective(TbFtpFile record);

    int updateByPrimaryKey(TbFtpFile record);
}