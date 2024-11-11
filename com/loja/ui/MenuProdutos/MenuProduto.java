package com.loja.ui.MenuProdutos;

import com.loja.gerenciador.GerenciadorProdutos.GerenciadorProduto;

import java.util.Scanner;

public class MenuProduto {
    private Scanner scanner = new Scanner(System.in);
    private GerenciadorProduto gerenciador;

    public MenuProduto(Scanner scanner, GerenciadorProduto gerenciador) {
        this.scanner = scanner;
        this.gerenciador = gerenciador;
    }

    public void exibirMenu(){
        int opcao;
        do{
            System.out.println("\nMenu do produto \n");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar produto");
            System.out.println("3. Excluir produto");
            System.out.println("4. Listar produtos");
            System.out.println("5. Buscar produto por ID");
            System.out.println("6. Buscar produto por Nome");
            System.out.println("7. Buscar produto por Categoria");
            System.out.println("8. Sair");
            opcao = scanner.nextInt();
            scanner.nextInt();
            switch(opcao){
                case 1:
                    gerenciador.criar();
                    break;
                case 2:
                    gerenciador.atualizar();
                    break;
                case 3:
                    gerenciador.remover();
                    break;
                case 4:
                    gerenciador.listarTodos();
                    break;
                case 5:
                    gerenciador.buscarPorId();
                    break;
                case 6:
                    gerenciador.bucarPorNome();
                    break;
                case 7:
                    gerenciador.buscarPorCategoria();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
            }
        }
        while (opcao != 0);
    }
}
