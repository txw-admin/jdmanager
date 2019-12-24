package com.newer.mapper;

import com.newer.domain.Room;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author 丁声树
 */
public interface RoomMapper {

    @Select("select * from room where roomid=#{roomId}")
    Room findById(@Param("roomId") int roomId);

    @Update("update room set roomstate=#{roomState} where roomid=#{roomId}")
    void update(@Param("roomId") int roomId,@Param("roomState") int roomState);
}
