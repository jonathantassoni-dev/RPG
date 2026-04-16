public class Paladino extends Personagem implements usaEstamina, UsaMana{

    private int estamina;
    private int mana;

    public Paladino(String nome) {
        super(nome, 500);
        this.estamina = 500;
        this.mana = 300;
    }

    @Override
    void atacar() {

    }

    @Override
    void defender() {

    }

    @Override
    public void consumirMana() {

    }

    @Override
    public void consumirEstamina() {

    }
}
