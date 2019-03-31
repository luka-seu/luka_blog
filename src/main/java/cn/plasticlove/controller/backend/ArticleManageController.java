package cn.plasticlove.controller.backend;


import cn.plasticlove.commons.ServerResponse;

import cn.plasticlove.dto.ArticlePageDto;
import cn.plasticlove.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;



/**
 * @author luka-seu
 * @description 文章后台控制器
 * @create 2019/3/22-19:24
 */
@Controller
@RequestMapping(value = "/manage/article/")
public class ArticleManageController {


    @Autowired
    private ArticleService articleService;




    @RequestMapping(value = "write")
    @ResponseBody
    public ServerResponse write(ArticlePageDto articlePageDto)  {

        return  articleService.insertArticle(articlePageDto);
    }

}
