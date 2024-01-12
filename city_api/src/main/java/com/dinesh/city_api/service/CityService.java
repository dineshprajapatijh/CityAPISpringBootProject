package com.dinesh.city_api.service;

import com.dinesh.city_api.entity.City;
import com.dinesh.city_api.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityRepo cityRepo;
    public void save(City city)
    {
        cityRepo.save(city);
    }

    public List<City> findAll() {
        return cityRepo.findAll();
    }
}
