package com.xueyou.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by wuxueyou on 2017/1/1.
 */
public interface FirstDao {
    List<Map<String,Object>> getUserList();
    List<Map<String,Object>> getUserListCount();
}
