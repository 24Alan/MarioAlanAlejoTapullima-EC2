package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ProductRequestDTO;
import com.example.demo.dto.ProductResponseDTO;

public interface ProductService {
	public void guardarProducto(ProductRequestDTO p);
	public void eliminarProducto(Integer id);
	public void editarProducto(ProductRequestDTO p);
	public List<ProductResponseDTO> listarProductos();
	public ProductResponseDTO productById(Integer id);
}
