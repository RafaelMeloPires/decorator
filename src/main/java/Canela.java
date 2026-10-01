public class Canela extends CafeDecorator {

    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public float getPreco() {
        return super.getPreco() + 1.0f;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Canela";
    }
}