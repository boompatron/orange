package com.example.orange.repository;

import com.example.orange.entity.Location;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import javax.swing.plaf.SpinnerUI;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class LocationRepositoryTest {
    @Autowired
    LocationRepository locationRepository;

    public void setUpLocation(){
        for(int i = 1; i < 4; i++) {
            String D = "Do" + i;
            String G = "Gu" + i;
            String L = "Lee" + i;
            locationRepository.save(
                    Location.builder()
                            .Do(D)
                            .Gu_Si(G)
                            .Lee_Dong(L).build()
            );
        }
    }
    @Test
    @DisplayName("Location Repo Test")
    public void LocationTest(){
        setUpLocation();
        List<Location> locationList = locationRepository.findAll();
        for(Location location : locationList){
            System.out.println(location.toString());
        }
    }
}