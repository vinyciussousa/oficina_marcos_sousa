package persistence;

import model.Cliente;

import java.util.List;

public interface ClienteDAO {
    void incluir(Cliente humanoide);

    void alterar(Cliente humanoide);

    void excluir(Cliente humanoide);

    List<Cliente> listarTodos();
}
