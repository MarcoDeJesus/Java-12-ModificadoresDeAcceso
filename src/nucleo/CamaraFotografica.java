package nucleo;

import partes.BotonFotografico;

public class CamaraFotografica {

    private BotonFotografico boton;
    boolean conFiltroLunar;
    protected String color;
    public boolean GarantiaDePorVida;

    public void TomarFotografia(){
        this.boton.Persionar();
    }

    public void VerificarFiltroLunar(){
        this.conFiltroLunar = true;
    }

    public void CambiarColor(){
        this.color = "verde";
    }

    public void ActivarGarantiaDePorVida(){
        this.GarantiaDePorVida = true;
    }

}
