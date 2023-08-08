//Requisitos
//- Desenvolva um sistema em Java com persistência de dados em memória, famoso CRUD.
//- O sistema deve apresentar um menu ao usuário, refletindo a situação de um
//  estoque do e-comerce da Joana, da loja JôJoias.
//- No menu deve ser possivel adicionar produto, excluir, consultar e atualizar.
//- Quando for comprado mais produtos ela precisa aumentar a quantidade de
//  produtos disponivel.
//- Quando o usuário consultar a lista de produtos da loja, sendo mostrado valor
//  unitário, quantidade disponivel e quantidade reservada
//- O usuario pode pedir para reservar um produto.
//- O sistema não controla pedidos, mas deve ser possivel cancelar uma reserva
//- Saida do estoque reserva para venda.
//OBS: Utilizar JOptionPane

package provacrud;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        List<Product> listaProduto = new ArrayList<>();
        String menu = "Estoque da JôJóias\n"
                + "\n1 - Consultar estoque atual"
                + "\n2 - Cadastrar novo produto"
                + "\n3 - Atualizar produto do estoque"
                + "\n4 - Remover produto do estoque"
                + "\n5 - Entrada de produto"
                + "\n6 - Saída de produto"
                + "\n7 - Encerrar aplicação\n";

        String resp = "";
        while (!resp.equals("7")) {
            resp = JOptionPane.showInputDialog(menu);
            switch (resp) {
                case "1":
                    estoque(listaProduto);
                    break;
                case "2":
                    criarProduto(listaProduto);
                    break;
                case "3":
                    atualizarProduto(listaProduto);
                    break;
                case "4":
                    removerProduto(listaProduto);
                    break;
                case "5":
                    entradaProduto(listaProduto);
                    break;
                case "6":
                    saidaProduto(listaProduto);
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Fechando aplicação...\nVolte Sempre!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção " + resp + " é inválida!");
                    break;
            }
        }
    }

    private static void estoque(List<Product> list) {
       
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sem produtos no estoque!");
        } else {
            String productsToPrint = "Lista de Produtos (nome, custo, qtd, res)\n";
            for (int i = 0; i < list.size(); i++) {
                productsToPrint += "\n" + list.get(i).toString();
                if (i % 10 == 0 || i == list.size() - 1) {
                    JOptionPane.showMessageDialog(null, productsToPrint);
                    productsToPrint = "Lista de Produtos (nome, custo, qtd, res)\n";
                }
            }
        }
    }

    private static void criarProduto(List<Product> list) {

        String nome = JOptionPane.showInputDialog("Nome produto:");
        Double custo = Double.parseDouble(JOptionPane.showInputDialog("Custo unitário:"));
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Qtd Disponível:"));
        int res = Integer.parseInt(JOptionPane.showInputDialog("Qtd Reservada:"));

        Product p = new Product(nome, custo, qtd, res);

        list.add(p);
    }

    private static void atualizarProduto(List<Product> list) {
        
        
        
    }

    private static void removerProduto(List<Product> list) {
      
    }

    private static void entradaProduto(List<Product> list) {

    }

    private static void saidaProduto(List<Product> list) {

    }

    private static Product procurarProduto(List<Product> list) {
        return null;
    }

}