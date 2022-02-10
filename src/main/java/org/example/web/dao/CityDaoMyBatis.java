package org.example.web.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.web.entity.City;
import org.example.web.utils.BatisUtil;

import java.util.List;

public class CityDaoMyBatis {
    public City getCityById(Integer id) {
        SqlSession session = BatisUtil.openSession();
        City city = session.selectOne("SelectOneCityById", id);
        session.commit();
        session.close();
        return city;
    }

    public List<City> getAllCities() {
        SqlSession session = BatisUtil.openSession();
        List<City> cityList = session.selectList("SelectAllCities");
        session.commit();
        session.close();
        return cityList;
    }

    public void addCity(City city) {
        SqlSession session = BatisUtil.openSession();
        session.insert("InsertCity", city);
        session.commit();
        session.close();
    }

    public void updateCity(City city) {
        SqlSession session = BatisUtil.openSession();
        session.update("UpdateCity", city);
        session.commit();
        session.close();
    }

    public void deleteCity(Integer id) {
        SqlSession session = BatisUtil.openSession();
        session.delete("DeleteCity", id);
        session.commit();
        session.close();
    }
}
