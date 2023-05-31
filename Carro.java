//Samuel penha jacobsen  RA:2269074
public class Carro extends Automovel {
    private int chassi;
    private int airbags;
    private String tracao;

    public Carro(){
        chassi = 0;
        airbags = 0;
        tracao = "";
    }
    public Carro(String placa, int ano, String marca, String cor, int chassi, int airbags, String tracao ){
        super(placa, ano, marca, cor);
        this.chassi = chassi;
        this.airbags = airbags;
        this.tracao = tracao;
    }

    public int getCHASSI(){
        return chassi;
    }

    public int getAIRBAGS(){
        return airbags;
    }

    public String getTRACAO(){
        return tracao;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public int totalRodas(){
        return 4;
    }
}
