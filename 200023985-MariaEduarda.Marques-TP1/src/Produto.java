
public class Produto {

    private String nomeProduto;
    private String descricao;
    private double valor;
    private double porcentagemLucro;
    private int quantidadeEstoque;
    

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
    
    public double getPorcentagemLucro() {
        return porcentagemLucro;
    }
    
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setPorcentagemLucro(double porcentagemLucro) {
        this.porcentagemLucro = porcentagemLucro;
    }
    
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    

}
