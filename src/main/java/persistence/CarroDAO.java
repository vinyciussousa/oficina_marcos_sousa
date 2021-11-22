package persistence;

import model.Carro;

import java.util.List;

public interface CarroDAO {
    void incluir(Carro veiculo);

    void alterar(Carro veiculo);

    void excluir(Carro veiculo);

    List<Carro> listarTodos();

    Carro buscarPelaPlaca(String placa);
}

