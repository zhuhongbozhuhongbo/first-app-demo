package com.imooc.firstappdemo.dao;

import com.imooc.firstappdemo.entity.Area;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao = null;
    @Test
    public void queryArea() throws Exception {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2, areaList.size());
    }

    @Test
    public void queryAreaById() throws Exception {
    }

    @Test
    public void insertArea() throws Exception {
    }

    @Test
    public void updateArea() throws Exception {
    }

    @Test
    public void deleteArea() throws Exception {
    }

}