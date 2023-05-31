//Samuel penha jacobsen  RA:2269074
public abstract class Automovel implements QntdRodas {
    private String placa;
    private int ano;
    private String marca;
    private String cor;

    public Automovel(){
        placa = "";
        ano = 0;
        marca = "";
        cor = "";
    }

    public Automovel (String placa, int ano, String marca, String cor){
        this.placa = placa;
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
    }

    public String getPLACA(){
        return placa;
    }

    public int getANO(){
        return ano;
    }

    public String getMARCA(){
        return marca;
    }

    public String getCOR(){
        return cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

