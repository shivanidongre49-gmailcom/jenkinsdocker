package com.example.dockerjenkins.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.dockerjenkins.model.ThemeParkRide;

public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
    List<ThemeParkRide> findByName(String name); 

}
