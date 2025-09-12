//package pacoteA;
public class Endereco{
    private String rua;
    private String cidade;
    private int numero;
    private String cep;
    private String casa;
    private String complemento;
    private String bairro;
    private String estado;

    public Endereco(String rua, String cidade){
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.cep= cep;
        this.casa = casa;
        this.complemento = complemento;
        this.bairro = bairro;
    }
    //RUA
    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    //CIDADE
    public String getCidade(){
        return cidade;
    }
    public void SetCidade(String cidade){
        this.cidade = cidade;
    }
    //NUMERO
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    //CEP
    public int getCep(){
        return cep;
    }
    public void SetCep(int cep){
        this.cep = cep;
    }
    //ESTADO
    public int getEstado(){
        return estado;
    }
    public void SetEstado(int estado){
        this.estado = estado;
    }
    //CASA
    public String getCasa(){
        return casa;
    }
    public void setCasa(String casa){
        this.casa = casa;
    }
    //COMPLEMENTO
    public String getComplemento(){
        return complemento;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    //BAIRRO
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String mostrarEndereco(){
        String descricao = "casa";
        if(!casa){
            descricao = "nao-casa";
        }
        return String.format("Rua: %s \nCidade: %s\nNúmero: %d\nCEP: %s,\nCasa: %s\nComplemento: %s\nBairro: %s", rua, cidade, numero,cep,descricao,complemento,bairro);
    }
}