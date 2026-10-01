public class Chantilly extends CafeDecorator {

    public Chantilly(Cafe cafe) {
        super(cafe);
    }

    @Override
    public float getPreco() {
        return super.getPreco() + 3.0f;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + Chantilly";
    }
}