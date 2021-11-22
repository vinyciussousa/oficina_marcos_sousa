package controller;

import model.Carro;
import persistence.CarroDaoImp;

import java.util.List;

public class CarroController {
    public void incluir(Carro veiculo) {
        CarroDaoImp cd = new CarroDaoImp();
        cd.incluir(veiculo);
    }

    public void alterar(Carro veiculo) {
        CarroDaoImp cd = new CarroDaoImp();
        cd.alterar(veiculo);
    }

    public void excluir(Carro veiculo) {
        CarroDaoImp cd = new CarroDaoImp();
        cd.excluir(veiculo);
    }

    public List<Carro> listarTodos() {
        CarroDaoImp cd = new CarroDaoImp();
        return cd.listarTodos();
    }

    public Carro buscarPelaPlaca(String placa) {
        CarroDaoImp cd = new CarroDaoImp();
        return cd.buscarPelaPlaca(placa);
    }
}
