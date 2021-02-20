package com.feiw.service.impl;



import com.feiw.mapper.GuestMapper;
import com.feiw.model.Guest;
import com.feiw.service.GuestService;
import com.feiw.tk.mapper.TkGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

//    @Autowired
//    private GuestMapper guestMapper;

    /**
     * 使用TK插件
     */
    @Autowired
    private TkGuestMapper tkGuestMapper;
    /**
     * 查询接口
     *
     * @return - List<Guest>
     */
    @Override
    public List<Guest> list() {
//        return guestMapper.getGuests();

        /**
         * 使用TK插件
         */
        return tkGuestMapper.selectAll();
    }




}
