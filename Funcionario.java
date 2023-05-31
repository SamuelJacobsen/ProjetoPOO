//Samuel penha jacobsen  RA:2269074
public class Funcionario extends Usuario{

    private int idFuncio;

    public Funcionario(){
        idFuncio = 0;
    }

    public Funcionario (int cpf, String nome, Endereco ender, int idFuncio){
        super(cpf, nome, ender);
        this.idFuncio = idFuncio;
    }

    public int getIdFuncio(){
        return idFuncio;
    }

    public void setIdFuncio(int idFuncio) {
        this.idFuncio = idFuncio;
    }
}
