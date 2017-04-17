package com.kuyun.bamboo.service;

import com.github.pagehelper.Page;
import com.kuyun.bamboo.BaseTest;
import com.kuyun.bamboo.module.TbFtpFile;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by songzj on 2017/4/14.
 */
public class FileServiceTest extends BaseTest {

    @Autowired
    private FileService fileService;

    @Test
    public void list() {
        Page<TbFtpFile> page = this.fileService.list(1, 10);
        System.out.println(page.getPages());
        for (TbFtpFile tbFtpFile : page.getResult()) {
            System.out.println(tbFtpFile.getFileName());
        }
    }

}
