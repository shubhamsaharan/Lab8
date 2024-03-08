package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list; /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }
    private ArrayList<City> cities;
    public void addCity(City city){
        cities.add(city);
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        assertFalse(list.hasCity(new City("Nonexistent", "XX")));
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        int initialSize = list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(), initialSize - 1);
    }

    @Test
    public void countCitiesTest(){
        list = MockCityList();
        assertEquals(0, list.getCount());
    }

}
