package nucleo;

public class CamaraEstereotipo extends CamaraFotografica{

    // Tratando de utilizar una propiedad PRIVADA en un MISMO PAQUETE
    // en una CLASE QUE HEREDA.
    public void TomarFotografiaConPolariod(){
        //super.boton.Persionar();
    }

    // Tratando de utilizar una propiedad POR DEFECTO (DEFAULT - PRIVATE PACKAGE)
    // en un MISMO PAQUETE 
    // en una CLASE QUE HEREDA
    public void VerificarFiltroLunar(){
        super.conFiltroLunar = true;
    }

    // Tratando de utilizar una propiedad PROTEGIDA en un MISMO PAQUETE
    // en una CLASE QUE HEREDA
    public void CambiarColor(){
        super.color = "Rojo";
    }

    // Tratando de utilizar una propiedad PUBLICA en un MISMO PAQUETE
    // en una CLASE QUE HEREDA
    public void ActivarGarantiaDePorVida(){
        super.GarantiaDePorVida = true;
    }
}
