package Model.Cliente;

public class ClientePJ extends Cliente {

    private String razaoSocial;
    private String cnpj;


    public ClientePJ(String razaoSocial, String cnpj){
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
    }

    public ClientePJ setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public ClientePJ setCnpj(String cnpj) {
        if(!cnpj.matches("[0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2}")){
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
