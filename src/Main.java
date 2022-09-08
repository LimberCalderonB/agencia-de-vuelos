import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Cliente carlos = new Cliente( 1, "Carlos", "Perez", "Perez");
         Ciudad cochabamba = new Ciudad( 1, "Cochabamba");
         Ciudad santaCruz = new Ciudad( 2, "Santa Cruz");
         Ciudad Tarija = new Ciudad( 3, "Tarija");

         Categoria turista = new Categoria( 1, "Turista");

         Aeropuerto aeropuertoCochabamba = new Aeropuerto( "ACH", "Aeropuerto Cochabamba",cochabamba);
         Aeropuerto aeropuertoSantaCruz = new Aeropuerto( "ASC", "Aeropuerto Santa Cruz", santaCruz);
         Aeropuerto aeropuertoTarija = new Aeropuerto( "AT", "Aeropuerto Tarija", Tarija);

        List<Vuelo> vuelos = new ArrayList<>();
         Vuelo cochabambaSantaCruz = new Vuelo("BOA-66660", Calendar.getInstance().getTime(), aeropuertoCochabamba, aeropuertoSantaCruz);
         vuelos.add(cochabambaSantaCruz);
         Vuelo santaCruzTarija =new Vuelo("BOA-66661", Calendar.getInstance().getTime(),aeropuertoSantaCruz, aeropuertoTarija );
         vuelos.add(santaCruzTarija);

         Billete billete=new Billete( 1, Calendar.getInstance().getTime(), 650.5, carlos, cochabamba, Tarija, turista, vuelos);

         System.out.println("BILLETE");
         System.out.println("*******");

         System.out.println("Id: "+billete.getIdBillete());
         System.out.println("Fecha: "+billete.getFechaEmicion());
         System.out.println("Precio Total: "+billete.getPreciototal());
         System.out.println("Cliente:"+ billete.getCliente());
         System.out.println("Origen: "+billete.getOrigen());
         System.out.println("Destino: "+billete.getDestino());
         System.out.println("Categoria: "+billete.getCategoria());
         System.out.println("Vuelos: "+billete.getVuelos());

         for (Vuelo vuelo:billete.getVuelos()){
             System.out.println("Codigo Vuelo: "+vuelo.getCodigoVuelo()+"  SALIDA  "+vuelo.getSalida()+ "ORIGEN: "+vuelo.getOrigen()+"DESTINO: "+vuelo.getDestino());
         }
    }
}
