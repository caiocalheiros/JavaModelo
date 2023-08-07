/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seila;

/**
 *
 * @author alunolab08
 */
public class Veiculo {
    private int ano;
    private String marca;
    private String cor;
    private String placa;
    private Modelo[] modelos;

    public void setModelos(Modelo[] modelos) {
        this.modelos = modelos;
    }

    public Veiculo(int ano, String marca, String cor, String placa, Modelo[] modelos) {
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.modelos = modelos;
    }

    public int getAno() {
        return ano;
    }

    public Modelo[] getModelos() {
        return modelos;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}


