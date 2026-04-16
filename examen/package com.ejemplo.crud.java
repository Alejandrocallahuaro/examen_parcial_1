package com.ejemplo.crud.model;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "productos")
@Schema(description = "Entidad que representa un Producto")
public class Producto {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID único del producto", example = "1")
    private Long id;

    @Schema(description = "Nombre del producto", example = "Laptop HP")
    @Column(nullable = false)
    private String nombre;

    @Schema(description = "Precio del producto", example = "3500.50")
    @Column(nullable = false)
    private Double precio;

    @Schema(description = "Stock disponible", example = "25")
    @Column(nullable = false)
    private Integer stock;

    @Schema(description = "Categoría del producto", example = "Electrónica")
    private String categoria;

    @Schema(description = "Código único del producto", example = "PROD-001")
    @Column(unique = true, nullable = false)
    private String codigo;
    public Producto() {}
    public Producto(String nombre, Double precio, Integer stock, String categoria, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.codigo = codigo;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
}