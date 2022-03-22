package co.com.sofka.dojoreactividad;


import co.com.sofka.dojoreactividad.PuntoUno.operadores.model.ContarCorreos;
import co.com.sofka.dojoreactividad.PuntoUno.operadores.model.ContarCorreosPorDominio;
import co.com.sofka.dojoreactividad.PuntoUno.operadores.model.Filter;

import co.com.sofka.dojoreactividad.PuntoUno.operadores.Distinct;
import co.com.sofka.dojoreactividad.PuntoUno.operadores.Map;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DojoreactividadApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DojoreactividadApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
    //Distinct distinto = new Distinct();
		//distinto.distinct();

		//Map mapeo = new Map();
		//mapeo.map();
    
//		Filter app = new Filter();
//		app.filter();

//		ContarCorreos contar = new ContarCorreos();
//		contar.contarCorreos();

//		ContarCorreosPorDominio contarCorreosPorDominio = new ContarCorreosPorDominio();
//		contarCorreosPorDominio.contarCorreosPorDominio();
	}
}
