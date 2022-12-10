public class Local {

    private String cidade;
    private String zona;

    Local(String cidade, String zona)
    {
        setCidade(cidade);
        setZona(zona);
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getCidade() {
        return this.cidade;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    public String getZona() {
        return this.zona;
    }

}