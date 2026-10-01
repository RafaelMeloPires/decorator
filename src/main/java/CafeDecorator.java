public abstract class CafeDecorator implements Cafe {

    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public float getPreco() {
        return cafe.getPreco();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }
}