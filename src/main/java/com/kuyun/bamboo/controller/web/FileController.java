package com.kuyun.bamboo.controller.web;

import com.github.pagehelper.Page;
import com.kuyun.bamboo.module.TbFtpFile;
import com.kuyun.bamboo.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by songzj on 2017/4/14.
 */
@Controller("webFileController")
@RequestMapping("/web/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping("/list/{pageNo}")
    public String list(@PathVariable("pageNo") Integer pageNo, Model model) {
        model.addAttribute("files", this.fileService.list(pageNo, 10));
        return "/file/list";
    }

    @RequestMapping("/json/list/{pageNo}")
    @ResponseBody
    public Page<TbFtpFile> list(@PathVariable("pageNo") Integer pageNo) {
        return this.fileService.list(pageNo, 10);
    }
}
