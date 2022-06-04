package com.idat.microservicioidatio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name = "Ropa")
@Entity
public class Ropa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRopa;
    private String tipoRopa;
    private String descripcion;

   
}
