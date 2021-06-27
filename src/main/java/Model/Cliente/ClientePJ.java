package Model.Cliente;

public class ClientePJ extends Cliente {

    public ClientePJ(String razaoSocial, String cnpj){
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    private String razaoSocial;
    private String cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }
}
