package exercicios.titureco;

public class Praia extends AtrativoTuristico {

    private boolean propriaParaBanho;
    private boolean perigoTubarao;
    private String tipoOrla;
    public static String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
    public static String TIPO_ONDAS_FORTES = "Ondas Fortes";
    public static String TIPO_ONDAS_MEDIAS = "Ondas Médias";

    public Praia(String nome, double latitude, double longitude, String rota, String cidade, String estado, boolean propriaParaBanho, boolean perigoTubarao, String orla){
        super(nome, latitude, longitude, rota, cidade, estado);
        this.tipoOrla = orla;
        this.perigoTubarao = perigoTubarao;
        this.propriaParaBanho = propriaParaBanho;
    }
    public Praia(){
        this("",0,0,"","","",true,true,"");
    }

    public boolean ehPropriaParaBanho(){
        return this.propriaParaBanho;
    }

    public void setPropriaParaBanho(boolean ehPropria){
        this.propriaParaBanho = ehPropria;
    }

    public boolean temPrigoTubarao(){
        return (this.perigoTubarao);
    }

    public void setPerigoTubarao(boolean temTubarao){
        this.perigoTubarao = temTubarao;
    }

    public String getTipoOrla(){
        return this.tipoOrla;
    }

    public void setTipoOrla(String tipoOrla){
        this.tipoOrla = tipoOrla;
    }

}
