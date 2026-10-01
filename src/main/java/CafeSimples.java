public class CafeSimples implements Cafe {

    private float preco;

    public CafeSimples() {
        this(5.0f);
    }

    public CafeSimples(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Café simples";
    }
}