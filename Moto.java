//Samuel penha jacobsen  RA:2269074
public class Moto extends Automovel{

    private int cilindrada;
    private String tipo;

    public Moto(){
        cilindrada = 0;
        tipo = "";
    }


    public Moto (String placa, int ano, String marca, String cor, int cilindrada, String tipo){
        super(placa, ano, marca, cor);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public int getCILIN(){
        return cilindrada;
    }

    public String getTYPE(){
        return tipo;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int totalRodas(){
        return 2;
    }
}
