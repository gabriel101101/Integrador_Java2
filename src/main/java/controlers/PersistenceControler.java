
package controlers;

import models.Tecnico;


public class PersistenceControler {
    TecnicoJpaController tecJPA  = new TecnicoJpaController();

    void crearTecnico(Tecnico tec) throws Exception 
    {
        tecJPA.create(tec);
    }
         
}
