public class Mago extends Personagem implements usaEstamina{

    private int mana;

    public Mago(String nome) {
        super(nome, 300);
        this.mana = 800;
    }

    @Override
    void atacar() {

    }

    @Override
    void defender() {

    }

    @Override
    public void consumirEstamina() {

    }
}
