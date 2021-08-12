package Components;

public class EnderecoInvalido extends Exception {
    private final int ender;

    public EnderecoInvalido(int e) {
        this.ender = e;
    }

    public String toString() {
        return "Endereco" + ender + "é invalido!";

    }
}
