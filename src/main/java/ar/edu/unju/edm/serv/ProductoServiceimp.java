package ar.edu.unju.edm.serv;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;
@Service
public class ProductoServiceimp implements ProductoService {
	

	//como se hace
	//guardar en array
	//guarde en BD
	
	@Autowired
	Producto unProducto;

	ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	
	@Override
	public void guardarProducto(Producto unProducto) {
		System.out.println(unProducto.getNombre());
		listaDeProductos.add(unProducto);
		System.out.println(listaDeProductos.size());
	}

	@Override
	public void modificarProducto(Producto unProductoAModificar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(Producto productoAEliminar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto obtenerProducto(String nombreProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Producto> obtenerTodoProducto() {
		// TODO Auto-generated method stub
		return listaDeProductos;
	}

	@Override
	public Producto obtenerProductoNuevo() {
		return unProducto;
	}

	@Override
	public Producto obtenerUltimoProducto() {
	int i = listaDeProductos.size() - 1;
	return listaDeProductos.get(i);
	}
}
