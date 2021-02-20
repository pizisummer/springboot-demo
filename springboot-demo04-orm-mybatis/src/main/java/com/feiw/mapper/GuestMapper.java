package com.feiw.mapper;

import com.feiw.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author pizisummer
 */

/**
 * 可以不用对每个类添加@Mapper注释来声明此类是Mapper类,
 * 直接在启动程序Application上添加扫描@MapperScan注解，启动的时候扫描指定package
 */
//@Mapper
@Repository
public interface GuestMapper {
    /**
     * 对应yml文件的方法一和方法二
     * @return -11
     */
//    List<Guest> getGuests();

    /**
     * 对应yml文件的方法三
     * @return -11
     */
    @Select("select name,role from guest")
    List<Guest> getGuests();
}
