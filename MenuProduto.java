import java.util.ArrayList;
import java.util.Scanner;

public class MenuProduto extends GerenciadorProduto{
    Scanner scanner = new Scanner(System.in);
    GerenciadorProduto gerenciador;

    public MenuProduto(String nome, double preco, int quantidadeEstoque, String categoria, ArrayList<Produto> produtos, int proximoId) {
        super(nome, preco, quantidadeEstoque, categoria, produtos, proximoId);
        this.gerenciador = new GerenciadorProduto(nome, preco, quantidadeEstoque, categoria, produtos, proximoId);
    }

    public void exibirMenu(){
        while(true){
            System.out.println("\nMenu do produto \n");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar produto");
            System.out.println("3. Excluir produto");
            System.out.println("4. Listar produtos");
            System.out.println("5. Buscar produto por ID");
            System.out.println("6. Buscar produto por Nome");
            System.out.println("7. Buscar produto por Categoria");
            System.out.println("8. Sair");
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    criar();
                    break;
                case 2:
                    atualizar();
                    break;
                case 3:
                    remover();
                    break;
                case 4:
                    listarTodos();
                    break;
                case 5:
                    buscarPorId();
                    break;
                case 6:
                    bucarPorNome();
                    break;
                case 7:
                    buscarPorCategoria();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
            }
        }
    }
}
