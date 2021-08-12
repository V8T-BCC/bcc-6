package Components;

public class RAM {
    private int tam = 0;
    final private int [] mem;

    public RAM(int k){
        tam = (int) Math.pow(2,k);
        mem = new int[tam];
    }

    public int Read(int e) throws EnderecoInvalido{
        if(EhValido(e))
            return mem[e];
        else
            throw new EnderecoInvalido(e);
    }

    public void Write(int e, int p) throws EnderecoInvalido{
        if( EhValido(e))
            mem[e] = p;
        else
            throw new EnderecoInvalido(e);
    }

    public boolean EhValido(int e){
        return (e >= 0 && e < tam);
    }
}