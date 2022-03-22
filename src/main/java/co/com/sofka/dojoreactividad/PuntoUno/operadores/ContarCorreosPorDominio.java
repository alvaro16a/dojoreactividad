package co.com.sofka.dojoreactividad.PuntoUno.operadores;

import co.com.sofka.dojoreactividad.PuntoUno.operadores.model.Correo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class ContarCorreosPorDominio {

    private static final Logger log = LoggerFactory.getLogger(ContarCorreosPorDominio.class);

    public void contarCorreosPorDominio() {

        List<Correo> correos= new ArrayList<>();
        correos.add(new Correo(1,"alvaro16a@gmail.com"));
        correos.add(new Correo(2,"alvaro16a@gmail.com"));
        correos.add(new Correo(3,"andreo1asa@gail.com"));
        correos.add(new Correo(4,"alvaa@outclock.com"));
        correos.add(new Correo(5,"camilo16a@hotmail.com"));
        correos.add(new Correo(6,"andres@gmail.com"));
        correos.add(new Correo(7,"jose@gmail.com"));
        correos.add(new Correo(8,"alvaro16a@gmail.com"));
        correos.add(new Correo(9,"felipe@outlook.com"));
        correos.add(new Correo(10,"gomeza@gmail.com"));
        correos.add(new Correo(11,"arango@gmail.com"));
        correos.add(new Correo(12,"felipe@hotmail.com"));
        correos.add(new Correo(13,"palma@outlook.com"));
        correos.add(new Correo(14,"sofka@sofka.com.co"));
        correos.add(new Correo(15,"nusofka@sofka.com.co"));
        correos.add(new Correo(16,"alvro16a@gmail.com"));
        correos.add(new Correo(17,"alvaro16a@gmail.com"));
        correos.add(new Correo(18,"andreo1asa@gail.com"));
        correos.add(new Correo(19,"alvaa@outclock.com"));
        correos.add(new Correo(20,"cami16a@hotmail.com"));
        correos.add(new Correo(21,"andres@gmail.com"));
        correos.add(new Correo(22,"jose@gmail.com"));
        correos.add(new Correo(23,"alro16a@gmail.com"));
        correos.add(new Correo(24,"felipe@outlook.com"));
        correos.add(new Correo(25,"gomeza@gmail.com"));
        correos.add(new Correo(26,"arao@gmail.com"));
        correos.add(new Correo(27,"felipe@hotmail.com"));
        correos.add(new Correo(28,"palma@outlook.com"));
        correos.add(new Correo(29,"sofka@sofka.com.co"));
        correos.add(new Correo(30,"nusoka@sofka.com.co"));

        Flux.fromIterable(correos)
                .filter(c -> c.getCorreo().contains("gmail"))
                .count()
                .subscribe(c -> log.info("Cantidad Correos Gmail = " + c));

        Flux.fromIterable(correos)
                .filter(c -> c.getCorreo().contains("hotmail"))
                .count()
                .subscribe(c -> log.info("Cantidad Correos hotmail = " + c));

        Flux.fromIterable(correos)
                .filter(c -> c.getCorreo().contains("outlook"))
                .count()
                .subscribe(c -> log.info("Cantidad Correos outlook = " + c));
    }
}
