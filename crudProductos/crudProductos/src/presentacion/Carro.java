/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Rui
 */
public class Carro {
    private String marca, modelo, tipo;
    private Color color;
    private Date fecha;
    private double precio;
    private int millas;
    private boolean camara;

    public Carro() {
    }

    public Carro(String marca, String modelo, String tipo, Color color, Date fecha, double precio, int millas, boolean camara) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.fecha = fecha;
        this.precio = precio;
        this.millas = millas;
        this.camara = camara;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMillas() {
        return millas;
    }

    public void setMillas(int millas) {
        this.millas = millas;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "Product{" + "marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", color=" + color + ", fecha=" + fecha + ", precio=" + precio + ", millas=" + millas + ", camara=" + camara + '}';
    }
}
