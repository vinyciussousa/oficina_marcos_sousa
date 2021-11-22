package controller;

import model.Oficina;
import persistence.OficinaDaoImp;

import java.util.List;

public class OficinaController {
    public void incluir(Oficina local) {
        OficinaDaoImp cd = new OficinaDaoImp();
        cd.incluir(local);
    }

    public void alterar(Oficina local) {
        OficinaDaoImp cd = new OficinaDaoImp();
        cd.alterar(local);
    }

    public void excluir(Oficina local) {
        OficinaDaoImp cd = new OficinaDaoImp();
        cd.excluir(local);
    }

    public List<Oficina> listarTodos() {
        OficinaDaoImp cd = new OficinaDaoImp();
        return cd.listarTodos();
    }
}
