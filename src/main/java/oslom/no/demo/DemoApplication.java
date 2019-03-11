package oslom.no.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import oslom.no.demo.model.Building;
import oslom.no.demo.repositery.BuildingRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private BuildingRepository buildingRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }





    @Override
    public void run(String... args) throws Exception {
        Building building = new Building("ali", "refstad");
        buildingRepository.save(building);
        buildingRepository.save(new Building("P58", "Pilestredet 68"));
        buildingRepository.save(new Building("P38", "Pilestredet 35"));


    }
}
