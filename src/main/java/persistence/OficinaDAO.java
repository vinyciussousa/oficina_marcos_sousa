package persistence;

import model.Oficina;

import java.util.List;

public interface OficinaDAO {
    void incluir(Oficina local);

    void alterar(Oficina local);

    void excluir(Oficina local);

    List<Oficina> listarTodos();
}
