package oslom.no.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import oslom.no.demo.model.Building;
import oslom.no.demo.service.BuldingService;

import java.util.List;
@org.springframework.web.bind.annotation.RestController

public class RestController {

    @Autowired
    BuldingService buldingService;

    @GetMapping
    public String home(){
        return  "This is a rest controller";
    }


    @GetMapping("/buildings")
    public List<Building>GetAllBulding(){
        return buldingService.getAllBuildings();
    }


    @GetMapping("buldings/{id}")
    public  Building getBuildingById(@PathVariable long id){
        return  buldingService.getBuildingById(id);

    }

    @DeleteMapping("buldings/{id}")
    public  void deleteBuildingById(@PathVariable long id){
          buldingService.deleteBuildingById(id);

    }

    @PostMapping("/buildings")
    public  Building saveBuilding(@RequestBody Building building){
        return  buldingService.saveBuilding(building);

    }

    @PostMapping("buldings/{id}")
    public  Building updateBuldingById(@PathVariable long id ,@RequestBody Building building){
        return  buldingService.updateBuildingById(building);

    }



}
