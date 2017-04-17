package com.kuyun.bamboo.controller.api;

import com.github.pagehelper.Page;
import com.kuyun.bamboo.module.TbFtpFile;
import com.kuyun.bamboo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by songzj on 2017/4/14.
 */
@RestController("apiFileController")
@RequestMapping("/api/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping("/list/{pageNo}")
    public Page<TbFtpFile> list(@PathVariable("pageNo") Integer pageNo) {
        return this.fileService.list(pageNo, 10);
    }
}
