package view;

import controller.OperacaoController;
import model.Cliente;
import model.Queue;

public class Main {

    public static void main(String[] args) {
        OperacaoController op = new OperacaoController();
        Queue<Cliente> fila = new Queue<>();
        // Gerando os clientes
        for (int i = 1; i <= 20; i++) {
            Cliente cliente = new Cliente();
            cliente.name = "Cliente" + i;
            cliente.qtdPecas = (int) (Math.random() * 31) + 20;
            cliente.valorPecas = (float) (Math.random() * 95.05) + 5;
            fila.insert(cliente);
        }

        try {
            op.Caixa(fila);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
