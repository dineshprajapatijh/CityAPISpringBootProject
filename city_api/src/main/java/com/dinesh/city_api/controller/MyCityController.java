package com.dinesh.city_api.controller;

import com.dinesh.city_api.entity.City;
import com.dinesh.city_api.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/city")
public class MyCityController {

    @Autowired
    CityService cityService;

    @PostMapping("/save")
    public void save(@RequestBody City city)
    {
        cityService.save(city);
    }

    @GetMapping("/home")
    public String get()
    {
        return "index.html";
    }

    @GetMapping("/getAll/city")
    public ResponseEntity<List> getAllCity()
    {
        List<String> li=new ArrayList<>();
        List<City> city =cityService.findAll();
        for(City city1:city)
        {
            li.add(city1.getName());
        }

        return new ResponseEntity<List>(li, HttpStatus.OK) ;

    }
}
