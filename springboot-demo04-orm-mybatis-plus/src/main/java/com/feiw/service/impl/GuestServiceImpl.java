package com.feiw.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feiw.mapper.GuestMapper;
import com.feiw.model.Guest;
import com.feiw.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pizisummer
 */
@Service
public class GuestServiceImpl extends ServiceImpl<GuestMapper,Guest> implements GuestService {

//    @Autowired
//    private GuestMapper guestMapper;
//
//    /**
//     * 查询接口
//     *
//     * @return - List<Guest>
//     */
//    @Override
//    public List<Guest> list() {
//        return guestMapper.selectList(null);
//    }




}
