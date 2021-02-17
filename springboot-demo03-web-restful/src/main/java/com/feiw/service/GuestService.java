package com.feiw.service;


import com.feiw.bean.Guest;

import java.util.List;

public interface GuestService {
    /**
     * 查询接口
     * @return - List<Guest>
     */
    List<Guest> list();

    /**
     * 添加
     * -@param guest
     */
    void add(Guest guest);

    /**
     *
     * -@param guest
     */
    void update(Guest guest);

    /**
     *
     * -@param name
     * -@return
     */
    Guest get(String name);

    /**
     *
     * -@param name
     */
    void delete(String name);
}
