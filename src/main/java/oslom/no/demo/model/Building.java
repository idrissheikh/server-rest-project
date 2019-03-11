package oslom.no.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor


public class Building {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String  name;
    private String address;


    public Building(String name, String adress) {
        this.name = name;
        this.address = adress;
    }
}

