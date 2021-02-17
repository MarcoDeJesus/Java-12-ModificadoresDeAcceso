package nucleo;

public class CamaraDePrueba {

    // Tratando de utilizar una propiedad PRIVADA en un MISMO PAQUETE
    public void TomarFotografiaConCamaraDePrueba(){
        CamaraFotografica camaraDePrueba = new CamaraFotografica();
        //camaraDePrueba.boton.Persionar();
    }

    // Tratando de utilizar una propiedad POR DEFECTO (DEFAULT - PRIVATE PACKAGE)
    // en un MISMO PAQUETE
    public void VerificarFiltroLunar(){
        CamaraFotografica camaraDePrueba = new CamaraFotografica();
        camaraDePrueba.conFiltroLunar = true;
    }

    // Tratando de utilizar una propiedad PROTEGIDA en un MISMO PAQUETE
    public void CambiarColor(){
        CamaraFotografica camaraDePrueba = new CamaraFotografica();
        camaraDePrueba.color = "Morada";
    }

    // Tratando de utilizar una propiedad PUBLICA en un MISMO PAQUETE
    public void ActivarGarantiaDePorVida(){
        CamaraFotografica camaraDePrueba = new CamaraFotografica();
        camaraDePrueba.GarantiaDePorVida = true;
    }
}
