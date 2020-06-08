package ejercicios2.chainResponsability1;

public class ResponsableDeCarnetizacion implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(PersonaRequisitos personaRequisitos) {
        if (personaRequisitos.isTieneCertificadoNacimiento() && personaRequisitos.isTieneFicha() && personaRequisitos.isTienePagoAlBanco()){
            System.out.println("Persona : [" + personaRequisitos.getNombre()+ "] Atendida por ResponsableDeCarnetizacion");
        }else {
            this.next().criteriaHandler(personaRequisitos);
        }
    }


}
