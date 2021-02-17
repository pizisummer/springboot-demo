package com.feiw.service.impl;

import com.feiw.bean.Guest;
import com.feiw.dao.GuestDao;
import com.feiw.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao guestDao;
    /**
     * 查询接口
     *
     * @return - List<Guest>
     */
    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    /**
     * 添加
     *
     * -@param guest
     */
    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    /**
     * -@param guest
     *
     * -@param guest
     */
    @Override
    public void update(Guest guest) {
        guestDao.update(guest);
    }

    /**
     * -@param name
     * -@return
     *
     * -@param name
     */
    @Override
    public Guest get(String name) {
        return guestDao.get(name);
    }

    /**
     * -@param name
     *
     * @param name
     */
    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }


}
