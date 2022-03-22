package co.com.sofka.dojoreactividad.PuntoUno.operadores.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    private static final Logger log = LoggerFactory.getLogger(Filter.class);


    public void filter() {

        List<Correo> correos= new ArrayList<>();
        correos.add(new Correo("alvaro16a@gmail.com"));
        correos.add(new Correo("alvaro16a@gmail.com"));
        correos.add(new Correo("andreo1asa@gail.com"));
        correos.add(new Correo("alvaa@outclock.com"));
        correos.add(new Correo("camilo16a@hotmail.com"));
        correos.add(new Correo("andres@gmail.com"));
        correos.add(new Correo("jose@gmail.com"));
        correos.add(new Correo("alvaro16a@gmail.com"));
        correos.add(new Correo("felipe@outlook.com"));
        correos.add(new Correo("gomeza@gmail.com"));
        correos.add(new Correo("arango@gmail.com"));
        correos.add(new Correo("felipe@hotmail.com"));
        correos.add(new Correo("palma@outlook.com"));
        correos.add(new Correo("sofka@sofka.com.co"));
        correos.add(new Correo("nusofka@sofka.com.co"));
        correos.add(new Correo("alvro16a@gmail.com"));
        correos.add(new Correo("alvaro16a@gmail.com"));
        correos.add(new Correo("andreo1asa@gail.com"));
        correos.add(new Correo("alvaa@outclock.com"));
        correos.add(new Correo("cami16a@hotmail.com"));
        correos.add(new Correo("andres@gmail.com"));
        correos.add(new Correo("jose@gmail.com"));
        correos.add(new Correo("alro16a@gmail.com"));
        correos.add(new Correo("felipe@outlook.com"));
        correos.add(new Correo("gomeza@gmail.com"));
        correos.add(new Correo("arao@gmail.com"));
        correos.add(new Correo("felipe@hotmail.com"));
        correos.add(new Correo("palma@outlook.com"));
        correos.add(new Correo("sofka@sofka.com.co"));
        correos.add(new Correo("nusoka@sofka.com.co"));

        //gmail
        log.info("Filtro Correos gmail");
        Flux.fromIterable(correos)
                .filter(c -> c.getCorreo().contains("gmail"))
                .subscribe(c -> log.info(c.toString()));

        //hotmail
        log.info("Filtro Correos hotmail");
        Flux.fromIterable(correos)
                .filter(c -> c.getCorreo().contains("hotmail"))
                .subscribe(c -> log.info(c.toString()));

        //outlook
        log.info("Filtro Correos outlook");
        Flux.fromIterable(correos)
                .filter(c -> c.getCorreo().contains("outlook"))
                .subscribe(c -> log.info(c.toString()));

    }

}
