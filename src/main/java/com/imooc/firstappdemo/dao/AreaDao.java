package com.imooc.firstappdemo.dao;

import com.imooc.firstappdemo.entity.Area;

import org.springframework.stereotype.Repository;

import java.util.List;


public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
