package model;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "oficina")
public class Oficina implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "especialidade")
    private String especialidade;
    @Column(name = "endereco")
    private String endereco;
    @OneToMany(targetEntity = Carro.class,
            cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Carro> carros;

    public Oficina(Integer codigo, String nome, String especialidade, String endereco, List<Carro> carros) {
        this.codigo = codigo;
        this.nome = nome;
        this.especialidade = especialidade;
        this.endereco = endereco;
        this.carros = carros;
    }

    public Oficina() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
