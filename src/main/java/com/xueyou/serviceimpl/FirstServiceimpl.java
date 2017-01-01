package com.xueyou.serviceimpl;


import com.xueyou.dao.FirstDao;
import com.xueyou.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuxueyou on 2017/1/1.
 */
@Service("firstService")
public class FirstServiceimpl implements FirstService {

    @Autowired
    public FirstDao firstDao;

    public Map<String, Object> getUserList() {
        Map<String,Object> resMap = new HashMap<>();
        resMap.put("list",firstDao.getUserList());
        resMap.put("count",firstDao.getUserListCount().get(0).get("count").toString());
        return resMap;
    }
}
