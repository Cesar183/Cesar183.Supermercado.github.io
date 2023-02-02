package com.api.Market.persistance;

import com.api.Market.persistance.crud.ProductoCrudRepository;
import com.api.Market.persistance.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    public List<Producto> obtenerTodo(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    public Optional<List<Producto>> obtenerEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }
    public Optional<Producto> obtenerProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }
    public Producto guardarProducto(Producto producto){
        return productoCrudRepository.save(producto);
    }
    public void eliminarProducto(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
