package oslom.no.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oslom.no.demo.model.Building;
import oslom.no.demo.repositery.BuildingRepository;

import java.util.List;

@Service
public class BuldingService {

    @Autowired
    public BuildingRepository buldingRepository;

    public List<Building> getAllBuildings(){
        return buldingRepository.findAll();
    }

    public Building getBuildingById(long id){
        return buldingRepository.findById(id).get();
    }


    public void deleteBuildingById(long id){
         buldingRepository.deleteById(id);
    }

    public Building saveBuilding(Building building){
        return buldingRepository.save(building);
    }

    public Building updateBuildingById(Building building){
        return buldingRepository.save(building);
    }

}
