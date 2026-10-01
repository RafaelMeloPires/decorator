public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public float getPreco() {
        return super.getPreco() + 2.0f;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Leite";
    }
}
