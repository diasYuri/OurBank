package Model.Cliente;

public class ClientePJ extends Cliente {

    public ClientePJ(String razaoSocial, String cnpj){
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    private String razaoSocial;
    private String cnpj;

    public ClientePJ setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public ClientePJ setCnpj(String cnpj) {
        if(!cnpj.matches("/^\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}$/")){
            System.out.println("Cnpj inválido");
            return this;
        }

        this.cnpj = cnpj;
        return this;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }
}
