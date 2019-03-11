package oslom.no.demo.repositery;


import org.springframework.data.jpa.repository.JpaRepository;
import oslom.no.demo.model.Building;

import java.util.Optional;

public interface BuildingRepository extends JpaRepository<Building, Long> {




}
