package co.com.sofka.dojoreactividad.PuntoDos;

import co.com.sofka.dojoreactividad.PuntoUno.operadores.Map;
import co.com.sofka.dojoreactividad.PuntoUno.operadores.model.Correo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chat {

    private static final Logger log = LoggerFactory.getLogger(Chat.class);

    public void chat(String mensaje) {


        List<String> malasPalabras= new ArrayList<>();
            malasPalabras.add("cafre");
            malasPalabras.add("marica");
            malasPalabras.add("baboso");
            malasPalabras.add("mojon");
            malasPalabras.add("ramera");
            malasPalabras.add("gusano");
            malasPalabras.add("cabestro");
            malasPalabras.add("ladilla");
            malasPalabras.add("capullo");

        Mono<String> monoMensaje= Mono.just(mensaje);
          monoMensaje.subscribe(txt -> log.info(txt));


        List<String> palabras =  Arrays.asList(mensaje.split(" "));
        Flux<String> mensajeFlujo = Flux.fromIterable(palabras);
        Flux<String> mensajeCorregido = mensajeFlujo.map(palabra ->{
            if(malasPalabras .contains(palabra)){
                return palabra.replace(palabra, "xxxxxx");
            }
            return palabra;
        });
        
        mensajeCorregido.collectList().subscribe(x-> log.info(x+" "));

    }
}

