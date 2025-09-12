//package pacoteA;
public class Endereco{
    private String rua;
    private int numero;
    private String casa;
    private String complemento;
    private String bairro;
    private String estado;
    private String cidade;
    private String cep;

    public Endereco(String rua,int numero,String casa,String complemento,String bairro,String estado, String cidade,String cep){
        this.rua = rua;
        this.numero = numero;
        this.casa = casa;
        this.complemento = complemento;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.cep= cep;
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
    public String getCep(){
        return cep;
    }
    public void SetCep(String cep){
        this.cep = cep;
    }
    //ESTADO
    public String getEstado(){
        return estado;
    }
    public void SetEstado(String estado){
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
        if(casa.isEmpty()){
            descricao = "nao-casa";
        }
        return String.format("Rua: %s, %d, Casa: %s, Complemento: %s, Bairro: %s, Cidade: %s - Estado: %s, CEP: %s", rua, numero, casa,complemento,bairro,cidade,estado, cep);
    }
}