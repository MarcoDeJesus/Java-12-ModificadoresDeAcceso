package inventarioCamaras;

import nucleo.CamaraFotografica;

public class Polaroid extends CamaraFotografica {
    
    // Tratando de utilizar una propiedad PRIVADA en un PAQUETE DIFERENTE
    // en una CLASE QUE HEREDA.
    public void TomarFotografiaConPolariod(){
        //super.boton.Persionar();
    }

    // Tratando de utilizar una propiedad POR DEFECTO (DEFAULT - PRIVATE PACKAGE)
    // en un PAQUETE DIFERENTE 
    // en una CLASE QUE HEREDA
    public void VerificarFiltroLunar(){
        //super.conFiltroLunar = true;
    }

    // Tratando de utilizar una propiedad PROTEGIDA en un PAQUETE DIFERENTE
    // en una CLASE QUE HEREDA
    public void CambiarColor(){
        super.color = "Rojo";
    }
    
    // Tratando de utilizar una propiedad PUBLICA en un PAQUETE DIFERENTE
    // en una CLASE QUE HEREDA
    public void ActivarGarantiaDePorVida(){
        super.GarantiaDePorVida = true;
    }
}
