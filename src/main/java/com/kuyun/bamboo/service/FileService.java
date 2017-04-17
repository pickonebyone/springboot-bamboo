package com.kuyun.bamboo.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kuyun.bamboo.mapper.TbFtpFileMapper;
import com.kuyun.bamboo.module.TbFtpFile;
import com.kuyun.bamboo.module.TbFtpFileExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by songzj on 2017/4/14.
 */
@Service
public class FileService {

    @Autowired
    private TbFtpFileMapper tbFtpFileMapper;

    public Page<TbFtpFile> list(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);

        return (Page<TbFtpFile>) this.tbFtpFileMapper.selectByExample(new TbFtpFileExample());
    }
}
