package com.feiw.service.impl;



import com.feiw.model.Guest;
import com.feiw.repository.GuestRepository;
import com.feiw.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestRepository guestRepository;
    /**
     * 查询接口
     *
     * @return - List<Guest>
     */
    @Override
    public List<Guest> list() {
        return guestRepository.findAll();
    }




}
