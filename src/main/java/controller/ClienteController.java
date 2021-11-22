package controller;

import model.Cliente;
import persistence.ClienteDaoImp;

import java.util.List;

public class ClienteController {
    public void incluir(Cliente humanoide) {
        ClienteDaoImp cd = new ClienteDaoImp();
        cd.incluir(humanoide);
    }

    public void alterar(Cliente humanoide) {
        ClienteDaoImp cd = new ClienteDaoImp();
        cd.alterar(humanoide);
    }

    public void excluir(Cliente humanoide) {
        ClienteDaoImp cd = new ClienteDaoImp();
        cd.excluir(humanoide);
    }

    public List<Cliente> listarTodos() {
        ClienteDaoImp cd = new ClienteDaoImp();
        return cd.listarTodos();
    }
}
