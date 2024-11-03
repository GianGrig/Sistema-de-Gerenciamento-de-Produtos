import java.util.Objects;

public class Produto {

    /**
     * Criação dos Atributos Finalizado
     */
    private Integer id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String categoria;

    /**
     * Criação do Construtor Finalizado
     * @param nome
     * @param preco
     * @param quantidadeEstoque
     * @param categoria
     */
    public Produto(String nome, double preco, int quantidadeEstoque, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

    /**
     * Criação dos gets e sets Finalizado
     * @return
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Criação do ToString Finalizado
     * @return
     */
    @Override
    public String toString() {
        return "Produto" +
                "id: " + id +
                "nome: " + nome +
                "preco: " + preco +
                "quantidadeEstoque: " + quantidadeEstoque +
                "categoria: '" + categoria ;
    }

    /**
     * Criação do Equals e do HashCode Finalizado
     * @param
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
