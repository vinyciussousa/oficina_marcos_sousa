package model;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "dataNascimento")
    private LocalDate dataNascimento;
    @OneToMany(targetEntity = Carro.class,
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Carro> carros;

    public Cliente(String cpf, String nome, LocalDate dataNascimento, List<Carro> carros) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.carros = carros;
    }

    public Cliente() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
