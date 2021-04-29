package ar.edu.unju.edm.controler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.serv.ProductoService;

@Controller
public class ProductoController {
	private static final Log CESAR = LogFactory.getLog(ProductoController.class);
	
	@Autowired
	ProductoService iProductoService;
	
@GetMapping("/producto")
public String cargarProducto(Model model) {
	model.addAttribute("unProducto", iProductoService.obtenerProductoNuevo());
	return("producto");
}
	
	@PostMapping("/producto")
	public String guardarNuevoProducto(@ModelAttribute("unProducto") Producto nuevoProducto, Model model) {
		iProductoService.guardarProducto(nuevoProducto);
		System.out.println(iProductoService.obtenerTodoProducto().get(0).getMarca());
		model.addAttribute("productos",iProductoService.obtenerTodoProducto());
		CESAR.error("Solo de prueba");
		CESAR.info("solo de prueba/info");
		CESAR.warn("Peligro, es una prueba");
		return("resultado");
	}
	
	@GetMapping("/ultimo")
	public String cargarUltimoProducto(Model model) {
		model.addAttribute("ultimoProducto", iProductoService.obtenerUltimoProducto());
		return("mostrar-ultimo");
	}
	@GetMapping("/volver")
	public String cargarNuevoProducto(Model model) {
		return("redirect:/producto");
	}
	
	
}

