public class Arqueiro extends Personagem implements usaEstamina{

    private int estamina;

    public Arqueiro(String nome) {
        super(nome, 500);
        this.estamina = 700;
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
