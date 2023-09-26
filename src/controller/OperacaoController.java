package controller;

import model.Cliente;
import model.Queue;

public class OperacaoController {

    public void Caixa(Queue<Cliente> fila) throws Exception {
        while (fila != null) {
            Cliente aux = fila.remove();
            double valTotal = aux.qtdPecas * aux.valorPecas;
            System.out.println(aux.name + " Pagou " + String.format("%.2f", valTotal) + " R$");
        }
    }
}
