import pojos.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        /*
        //producto
        Producto producto = new Producto("C001", "Teclado retroiluminado");
        System.out.println(producto);

        //alquilable
        Alquilable alquilable = new Alquilable("A005", "Monitor 19", 10.5);
        System.out.println(alquilable);

        //tecnologico
        Empresa empresa = new Empresa("DELL", "av principal#35", 2000);
        Tecnologico tecnologico = new Tecnologico("T100", "Vostro 100", "USA", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);

        //Monitor
        Monitor monitor = new Monitor("M111", "Monitor 21", 12.5, "FULL HD");
        System.out.println(monitor);

        //Cpu
        Empresa toshiba = new Empresa("TOSHIBA", "av SEGUNDA #77", 1500);
        Cpu cpu = new Cpu("T200", "Satellite", "China", Calendar.getInstance().getTime(), toshiba, 16);
        System.out.println(cpu);


        //polimorfismo
        Producto producto = new Producto("G120", "Genius 120+");

        Producto lj750 = new Impresora("lj750", "Canon laserjet 750", 30);
        //System.out.println(lj750);
        Producto s200 = new Monitor("s200+", "samsung s200 plus", 15, "FHD");
        //System.out.println(s200);
        Producto m500 = new DiscoDuro("m500", "Maxtor m500", 10, 500);
        //System.out.println(m500);

        Impresora impresora = (Impresora) lj750;
        //System.out.println(impresora);
        Monitor monitor = (Monitor) s200;
        //System.out.println(monitor);
        DiscoDuro discoDuro = (DiscoDuro) m500;
        //System.out.println(discoDuro);

        Producto[] productos = new Producto[3];
        productos[0] = impresora;
        productos[1] = monitor;
        productos[2] = discoDuro;

        for (int i = 0; i < productos.length; i++){
            System.out.println(productos[i]);
        }

         */

        Monitor lg1080 = new Monitor("lg1080", "Monitor LG 1080+", 10, "HD");
        lg1080.reset();

        DiscoDuro s1000 = new DiscoDuro("s1000", "Samsung s1000", 20, 1000);
        s1000.reset();
    }
}
