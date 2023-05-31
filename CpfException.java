//Samuel penha jacobsen  RA:2269074
public class CpfException extends Exception {

    EntDados entDados = new EntDados();

    public void corrigeCpf(Usuario usuario){
        try{
            System.out.printf("\n[ENTRE COM CPF DE 0 A 1000]\nDigite seu CPF novamente: ");
            usuario.setCpf(entDados.leiaInt());
        }
        catch(CpfException cpfe){
            cpfe.corrigeCpf(usuario);
        }
    }
}
