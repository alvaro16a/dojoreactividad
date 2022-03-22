package co.com.sofka.dojoreactividad.PuntoDos;

import co.com.sofka.dojoreactividad.PuntoUno.operadores.model.Correo;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class Chat {

    public void chat() {

        List<String> malasPalabras= new ArrayList<>();
            malasPalabras.add("cafre");
            malasPalabras.add("marica");
            malasPalabras.add("baboso");
            malasPalabras.add("mojon");
            malasPalabras.add("ramera");
            malasPalabras.add("Gusano");
            malasPalabras.add("cabestro");
            malasPalabras.add("Ladilla");
            malasPalabras.add("capullo");

        List<String> mensajes= new ArrayList<>();
            mensajes.add("hola como estas");
            mensajes.add("sos un mojon pedazo de capullo");

            Flux<String> mensajesCorregidos=Flux.fromIterable(mensajes)
                    .map(mensaje -> {
                        malasPalabras.stream().map(palabra -> {
                            mensaje.replaceAll(palabra,"xxxx");
                            return mensaje;
                        });
                       return mensaje;
                    });
        mensajesCorregidos.subscribe(correo-> log.info(correo.toString()));
    }
}
