//Samuel penha jacobsen  RA:2269074
public class Endereco {
    private int cep;
    private String rua;
    private int num;

    //POLIMORFISMO POR SOBRECARGA
    public Endereco(){
        cep = 0;
        rua = "";
        num = 0;
    }

    public Endereco (int cep, String rua, int num){
        this.cep = cep;
        this.rua = rua;
        this.num = num;
    }

    public int getCep(){
        return cep;
    }

    public String getRua(){
        return rua;
    }

    public int getNum(){
        return num;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
