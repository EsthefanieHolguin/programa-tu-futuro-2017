package cl.accenture.curso_java.agenda_telefonica;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Agenda agenda = new Agenda();
        agenda.setNombre("Curso Java");
        agenda.getContactos().add( new Contacto("juan", 28, "+5697...") );
        agenda.getContactos().add( new Contacto("francisco", 30, "+5698...") );
        try {
			agenda.buscarContacto("Juanx").imprimir();
		} catch (ContactoNoExisteException e) {
			System.out.println( "ha ocurrido un error " + e.getMessage() );
			e.printStackTrace();
		}
//        agenda.imprimir();
//        agenda.buscarContactos("Juan").size();
//        Contacto cont = agenda.buscarContacto("Juan");
//        cont.imprimir();
    }
}
