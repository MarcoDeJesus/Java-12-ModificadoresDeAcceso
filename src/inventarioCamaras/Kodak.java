package inventarioCamaras;

import nucleo.CamaraFotografica;

public class Kodak {

    // Tratando de utilizar una propiedad PRIVADA en un PAQUETE DIFERENTE
    public void TomarFotografiaConKodak(){
        CamaraFotografica kodak = new CamaraFotografica();
        //kodak.boton.Persionar();
    }

    // Tratando de utilizar una propiedad POR DEFECTO (DEFAULT - PRIVATE PACKAGE)
    // en un PAQUETE DIFERENTE
    public void VerificarFiltroLunar(){
        CamaraFotografica kodak = new CamaraFotografica();
        //kodak.conFiltroLunar = true;
    }

    // Tratando de utilizar una propiedad PROTEGIDA en un PAQUETE DIFERENTE
    public void CambiarColor(){
        CamaraFotografica kodak = new CamaraFotografica();
        //kodak.color = "Amarillo";
    }

    // Tratando de utilizar una propiedad PUBLICA en un PAQUETE DIFERENTE
    public void ActivarGarantiaDePorVida(){
        CamaraFotografica kodak = new CamaraFotografica();
        kodak.GarantiaDePorVida = true;
    }
}
