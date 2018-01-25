package com.sys.deduct.controller;


import com.sys.deduct.common.AjaxRes;
import com.sys.deduct.domain.User;
import com.sys.deduct.service.UserService;
import com.sys.deduct.util.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public String findById(HttpSession session, HttpServletRequest request, HttpServletResponse response,@PathVariable("id")int id) throws Exception{
        AjaxRes res = new AjaxRes();
        try {
//            int id = Integer.valueOf(request.getParameter("id"));
            User user = userService.findById(id);
            res.setSucceed(user, "获取数据成功");
        }catch (Exception e){
            e.printStackTrace();
            res.setFailMsg("系统内部错误");
        }
        return JacksonUtil.obj2json(res);
    }

    @RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
    public String findByName(HttpSession session, HttpServletRequest request, HttpServletResponse response,@PathVariable("name")String name) throws Exception{
        AjaxRes res = new AjaxRes();
        try {
            User user = userService.findByName(name);
            res.setSucceed(user, "获取数据成功");
        }catch (Exception e){
            e.printStackTrace();
            res.setFailMsg("系统内部错误");
        }
        return JacksonUtil.obj2json(res);
    }

}
