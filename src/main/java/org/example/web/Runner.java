package org.example.web;

import org.example.web.dao.CityDaoMyBatis;
import org.example.web.entity.City;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        City cityForAdding=new City(5000, "igor", "USA", "igr", 1);
        CityDaoMyBatis dao=new CityDaoMyBatis();
        dao.addCity(cityForAdding);
        City city=dao.getCityById(5000);

        System.out.println("after adding: "+city);
        List<City> cityList=dao.getAllCities();
        System.out.println(cityList.get(3));
        City cityForUpdating=new City(5000, "igor2", "USA", "igr2", 2);
        dao.updateCity(cityForUpdating);

        System.out.println("after update: "+dao.getCityById(5000));
        dao.deleteCity(5000);

        System.out.println("after delete: "+dao.getCityById(5000));
    }
}
