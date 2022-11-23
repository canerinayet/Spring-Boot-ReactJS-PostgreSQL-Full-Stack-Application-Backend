package com.caner.demo.entities;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Table(name="hasta")
@Data
@SequenceGenerator(name = "seqhasta",sequenceName = "seq_hasta",allocationSize = 1)
public class Hasta {
    @Id
    @GeneratedValue(generator = "seqhasta",strategy = GenerationType.SEQUENCE)


    Long hasta_id;
    String adi;
    String soyadi;
    String hastalik;


}
