import java.util.ArrayList;
import java.util.List;

public class GerenciadorProduto extends Produto {
    private ArrayList<Produto> produtos;
    private int proximoId;

    public GerenciadorProduto(String nome, double preco, int quantidadeEstoque, String categoria, ArrayList<Produto> produtos, int proximoId) {
        super(nome,preco,quantidadeEstoque,categoria);
        this.produtos = new ArrayList<>();
        this.proximoId = proximoId;
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

    public void criar(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Produto> listarProdutos() {
        ArrayList<Produto> produtos = new ArrayList<>();
        for (Produto p : produtos) {
            produtos.add(p);
        }
        return produtos;
    }

    public boolean atualizar(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId().equals(produto.getId())) {
                p.
            }
        }
    }

    public boolean remover(Produto produto) {
        for (Produto p : produtos) {
            if (p.getId().equals(produto.getId())) {
                produtos.remove(p);
                return true;
            }
        }
        return false;
    }

    public List<Produto> bucarPorNome(String nome) {
        ArrayList<Produto> produtos = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getNome().equals(nome)) {
                produtos.add(p);
            }
        }
    }

    public List<Produto> buscarPorCategoria(String categoria) {}

    private void validarProduto(Produto produto) {

    }
}
