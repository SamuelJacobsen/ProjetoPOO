//Samuel penha jacobsen  RA:2269074
public class Principal {

    static EntDados entDados = new EntDados();
        public static Carro receberCarro() {
            System.out.println("\nDIGITE A PLACA DO CARRO: ");
            String p = entDados.leiaString();

            System.out.println("\nDIGITE O ANO DO CARRO: ");
            int a = entDados.leiaInt();

            System.out.println("\nDIGITE A MARCA DO CARRO: ");
            String m = entDados.leiaString();

            System.out.println("\nDIGITE A COR DO CARRO: ");
            String c = entDados.leiaString();

            System.out.println("\nDIGITE O NUMERO DO CHASSI DO CARRO: ");
            int Nch = entDados.leiaInt();

            System.out.println("\nDIGITE QUANTOS AIRBAGS POSSUI O CARRO: ");
            int Na = entDados.leiaInt();

            System.out.println("\nDIGITE O TIPO DE TRACAO DO CARRO: ");
            String t = entDados.leiaString();

            Carro carro = new Carro(p, a, m, c, Nch, Na, t);
            return carro;
        }

    public static void mostrarCarro(Carro carro) {
        System.out.println("\n        ***** DADOS DO CARRO *****");
        System.out.println("PLACA: " + carro.getPLACA());
        System.out.println("ANO: " + carro.getANO());
        System.out.println("MARCA: " + carro.getMARCA());
        System.out.println("COR: " + carro.getCOR());
        System.out.println("NUMERO DO CHASSI: " + carro.getCHASSI());
        System.out.println("QUANTIDADE DE AIRBAGS: " + carro.getAIRBAGS());
        System.out.println("TIPO DE TRACAO: " + carro.getTRACAO());
        System.out.println("QUANTIDADE DE RODAS: " + carro.totalRodas());
    }

    public static Moto receberMoto() {
        System.out.println("\nDIGITE A PLACA DA MOTO: ");
        String p = entDados.leiaString();

        System.out.println("\nDIGITE O ANO DA MOTO: ");
        int a = entDados.leiaInt();

        System.out.println("\nDIGITE A MARCA DA MOTO: ");
        String m = entDados.leiaString();

        System.out.println("\nDIGITE A COR DA MOTO: ");
        String c = entDados.leiaString();

        System.out.println("\nDIGITE QUANTAS CILINDRADAS A MOTO POSSUI: ");
        int cilin = entDados.leiaInt();

        System.out.println("\nDIGITE O TIPO DA MOTO (NAKED OU CARENADA): ");
        String tipo = entDados.leiaString();

        Moto moto = new Moto(p, a, m, c, cilin, tipo);
        return moto;
    }

    public static void mostrarMoto(Moto moto) {
        System.out.println("\n        ***** DADOS DA MOTO *****");
        System.out.println("PLACA: " + moto.getPLACA());
        System.out.println("ANO: " + moto.getANO());
        System.out.println("MARCA: " + moto.getMARCA());
        System.out.println("COR: " + moto.getCOR());
        System.out.println("CILINDRADA: " + moto.getCILIN());
        System.out.println("TIPO DA MOTO: " + moto.getTYPE());
        System.out.println("QUANTIDADE DE RODAS: " + moto.totalRodas());
    }

    public static Cliente receberCliente() {

        Cliente cliente = new Cliente();

        try {
            System.out.println("\nDIGITE SEU CPF: ");
            cliente.setCpf(entDados.leiaInt());
        }
        catch (CpfException cpe) {
            cpe.corrigeCpf(cliente);
        }

        System.out.println("\nDIGITE SEU NOME: ");
        cliente.setNome(entDados.leiaString());

        System.out.println("\nDIGITE SEU ID: ");
        cliente.setIdCliente(entDados.leiaInt());

        System.out.println("\nDIGITE SEU CEP: ");
        cliente.getEnder().setCep(entDados.leiaInt());

        System.out.println("\nDIGITE SUA RUA: ");
        cliente.getEnder().setRua(entDados.leiaString());

        System.out.println("\nDIGITE O NUMERO DA SUA RESIDENCIA: ");
        cliente.getEnder().setNum(entDados.leiaInt());

        return cliente;

    }

    public static void mostrarCliente(Cliente cliente) {
        System.out.println("\n        ***** DADOS DO CLIENTE *****");
        System.out.println("NOME: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("ID: " + cliente.getIdCliente());
        System.out.println("CEP: " + cliente.getEnder().getCep());
        System.out.println("RUA: " + cliente.getEnder().getRua());
        System.out.println("NUMERO DA RESIDENCIA: " + cliente.getEnder().getNum());
    }

    public static Funcionario receberFuncionario() {

        Funcionario funcio = new Funcionario();

        try {
            System.out.println("\nDIGITE SEU CPF: ");
            funcio.setCpf(entDados.leiaInt());
        }
        catch (CpfException cpe) {
            cpe.corrigeCpf(funcio);
        }

        System.out.println("\nDIGITE SEU NOME: ");
        funcio.setNome(entDados.leiaString());

        System.out.println("\nDIGITE SEU ID: ");
        funcio.setIdFuncio(entDados.leiaInt());

        System.out.println("\nDIGITE SEU CEP: ");
        funcio.getEnder().setCep(entDados.leiaInt());

        System.out.println("\nDIGITE SUA RUA: ");
        funcio.getEnder().setRua(entDados.leiaString());

        System.out.println("\nDIGITE O NUMERO DA SUA RESIDENCIA: ");
        funcio.getEnder().setNum(entDados.leiaInt());

        return funcio;
    }

    public static void mostrarFuncionario(Funcionario funcio) {
        System.out.println("\n        ***** DADOS DO FUNCIONARIO *****");
        System.out.println("NOME: " + funcio.getNome());
        System.out.println("CPF: " + funcio.getCpf());
        System.out.println("ID: " + funcio.getIdFuncio());
        System.out.println("CEP: " + funcio.getEnder().getCep());
        System.out.println("RUA: " + funcio.getEnder().getRua());
        System.out.println("NUMERO DA RESIDENCIA: " + funcio.getEnder().getNum());
    }

    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        Funcionario f1 = new Funcionario();
        Carro car1 = new Carro();
        Moto mot1 = new Moto();

        System.out.println("\n        ***** SISTEMA DE CADASTRO CONCESSIONARIA *****");
        System.out.println("\nDIGITE [1] PARA CLIENTE \nDIGITE [2] PARA FUNCIONARIO");
        int resp1 = entDados.leiaInt();

        switch (resp1) {
            case 1:
                c1 = receberCliente();
                break;

            case 2:
                f1 = receberFuncionario();
                break;

            default:
                System.out.println("\nA OPCAO ESCOLHIDA NAO ESTA DISPONIVEL!");
                System.out.println("\nPROGRAMA FINALIZADO!");
                break;
        }
        System.out.println("\nDIGITE [1] PARA CADASTRAR UM CARRO \nDIGITE [2] PARA CADASTRAR UMA MOTO");
        int resp2 = entDados.leiaInt();
        switch (resp2) {
            case 1:
                car1 = receberCarro();
                break;

            case 2:
                mot1 = receberMoto();
                break;

            default:
                System.out.println("\nA OPCAO ESCOLHIDA NAO ESTA DISPONIVEL!");
                System.out.println("\nPROGRAMA FINALIZADO!");
                break;
        }

        if (resp1 == 1)
            mostrarCliente(c1);
        else
            mostrarFuncionario(f1);
        if (resp2 == 1)
            mostrarCarro(car1);
        else
            mostrarMoto(mot1);
    }
}