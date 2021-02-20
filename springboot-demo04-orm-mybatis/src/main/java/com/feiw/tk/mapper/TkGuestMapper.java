package com.feiw.tk.mapper;

import com.feiw.model.Guest;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author pizisummer
 */
public interface TkGuestMapper extends Mapper<Guest> {

}
