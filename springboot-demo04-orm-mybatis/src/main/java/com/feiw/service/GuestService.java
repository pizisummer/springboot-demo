package com.feiw.service;




import com.feiw.model.Guest;

import java.util.List;

/**
 * @author pizisummer
 */
public interface GuestService {
    /**
     * 查询接口
     * @return - List<Guest>
     */
    List<Guest> list();

}
