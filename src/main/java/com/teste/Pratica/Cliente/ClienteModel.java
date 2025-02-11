package com.teste.Pratica.Cliente;

import com.teste.Pratica.Carros.CarrosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cliente")

@NoArgsConstructor
@AllArgsConstructor

@Data
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;

    @OneToMany(mappedBy = "cliente")
    private List<CarrosModel> carros;

}
