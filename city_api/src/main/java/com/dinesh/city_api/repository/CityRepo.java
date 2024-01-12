package com.dinesh.city_api.repository;

import com.dinesh.city_api.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City,Integer> {
}
