package com.xueyou.controller;

import com.xueyou.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuxueyou on 2017/1/1.
 *   /-------------------------------------------------------------------------\
 *   |                                                                         |
 *   |                  ***   ***           ***                                |
 *   |                  ***   ***           ***                                |
 *   |                  ***   ***           ***                         **     |
 *   |                        ***           ***                        ***     |
 *   |                        ***           ***                        ***     |
 *   | ***    ***   *** ***   ***      **** ***     *****    *****   *******   |
 *   | ***    ****  *** ***   ***    **********   *******   *******  *******   |
 *   |  **   *****  **  ***   ***    **********   *******   *    *** *******   |
 *   |  ***  *****  **  ***   ***   ****   ****  ****   *        ***   ***     |
 *   |  ***  ** **  **  ***   ***   ***     ***  ***         *******   ***     |
 *   |   **  ** ******  ***   ***   ***     ***  ***       *********   ***     |
 *   |   *****  *****   ***   ***   ****   ****  ****   *  ***   ***   ***     |
 *   |   *****  *****   ***   ***   ***********   *******  ***   ***   *****   |
 *   |    ****   ****   ***   ***    ****** ***   *******  *********   *****   |
 *   |    ***    ***    ***   ***     ****  ***     ****    **** ***    ****   |
 *   |                                                                         |
 *   \-------------------------------------------------------------------------/
 */
@RestController
@RequestMapping(value = "/first",method = {RequestMethod.GET,RequestMethod.POST},produces = "application/json;charset='utf-8'")
public class FirstController {

    @Autowired
    public FirstService firstService;

    @RequestMapping(value = "/t")
    public Map<String,Object> t(){
        Map<String,Object> objectMap = new HashMap<>();
        objectMap.put("cc",123);
        objectMap.put("name",null);
        return objectMap;
    }

    @RequestMapping(value = "/getuserlist")
    public Map<String,Object> getUserList(){
        return firstService.getUserList();
    }

}
