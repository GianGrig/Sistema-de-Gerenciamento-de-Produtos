package com.loja.gerenciador.GerenciadorProdutos;

import com.loja.modelo.Produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProduto extends Produto {
    private ArrayList<Produto> produtos;
    private int proximoId;

    public GerenciadorProduto(String nome, double preco, int quantidadeEstoque, String categoria, ArrayList<Produto> produtos, int proximoId) {
        super(nome,preco,quantidadeEstoque,categoria);
        this.produtos = new ArrayList<>();
        this.proximoId = 1;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getProximoId() {
        return proximoId;
    }

    public void setProximoId(int proximoId) {
        this.proximoId = proximoId;
    }

    // Finalizado
    public void criar(Produto produto) {
        if (validarDados(produto)){
            produto.setId(proximoId++);
            produtos.add(produto);
        }
    }

    private boolean validarDados(Produto produto){
        return produto.getNome() != null && !produto.getNome().isEmpty() &&
                produto.getPreco() > 0 && produto.getQuantidadeEstoque() >= 0;
    }

    // Finalizado
    public Produto buscarPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // Finalizado
    public List<Produto> listarTodos() {
        ArrayList<Produto> produtos = new ArrayList<>();
        for (Produto p : produtos) {
            produtos.add(p);
        }
        return produtos;
    }

    // Finalizado
    public boolean atualizar(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId().equals(produto.getId())) {
                p.setPreco(produto.getPreco());
                p.setCategoria(produto.getCategoria());
                p.setQuantidadeEstoque(produto.getQuantidadeEstoque());
                return true;
            }
        }
        return false;
    }

    // Finalizado
    public boolean remover(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId().equals(produto.getId())) {
                produtos.remove(p);
                return true;
            }
        }
        return false;
    }

    // Finalizado
    public List<Produto> bucarPorNome(String nome) {
        ArrayList<Produto> produtos = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return produtos;
            }
        }
        return null;
    }

    // Finalizado
    public List<Produto> buscarPorCategoria(String categoria) {
        ArrayList<Produto> produtos = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                return produtos;
            }
        }
        return null;
    }

    // Finalizado
    private void validadarProduto(Produto produto) {
        if (produto.getNome() == null || produto.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser vazio.");
        }
        if (produto.getPreco() <= 0) {
            throw new IllegalArgumentException("O preço do produto deve ser positivo.");
        }
        if (produto.getQuantidadeEstoque() < 0) {
            throw new IllegalArgumentException("A quantidade do produto não pode ser negativa.");
        }
    }
}
