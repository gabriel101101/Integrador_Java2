
package controlers;

import models.Tecnico;

public class Controllers 
{
   PersistenceControler control = new PersistenceControler(); 
   
   public void crearTecnico(Tecnico tec) throws Exception
   {
       control.crearTecnico(tec);
   }
}
