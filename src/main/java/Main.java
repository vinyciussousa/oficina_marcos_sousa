import controller.CarroController;
import controller.ClienteController;
import controller.OficinaController;
import model.Carro;
import model.Cliente;
import model.Oficina;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarroController crc = new CarroController();
        ClienteController clc = new ClienteController();
        OficinaController oc = new OficinaController();

        Carro carro1 = new Carro();
        carro1.setPlaca("ABC-1234");
        carro1.setModelo("Palio");
        carro1.setAnoModelo(2010);
        carro1.setAno(2010);
        carro1.setMarca("Fiat");
        carro1.setCor("Prata");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Marcos Sousa");
        cliente1.setCpf("067.093.941-23");
        LocalDate dataDeNascimento = LocalDate.of(1999, 8, 26);
        cliente1.setDataNascimento(dataDeNascimento);
        cliente1.setCarros(List.of(new Carro[]{carro1}));

        Oficina oficina1 = new Oficina();
        oficina1.setCodigo(123456);
        oficina1.setEndereco("Setor de Oficinas Sul");
        oficina1.setNome("Oficina 1");
        oficina1.setEspecialidade("Carros da Fiat");
        oficina1.setCarros(List.of(new Carro[]{carro1}));

        crc.incluir(carro1);
        clc.incluir(cliente1);
        oc.incluir(oficina1);

        carro1.setCliente(cliente1);
        carro1.setOficina(oficina1);

        crc.alterar(carro1);

        System.out.println(carro1);
        System.out.println(cliente1);
        System.out.println(oficina1);

    }
}
