/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seila;

/**
 *
 * @author alunolab08
 */
public class Seguro {
    private float valor;
    private boolean vigencia;
    private Cliente proprietario;
    private Cliente[] assegurados;
    private Veiculo[] veiculos;
    
    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    public Seguro(float valor, boolean vigencia, Cliente proprietario, Cliente[] assegurados, Veiculo[] veiculos) {
        this.valor = valor;
        this.vigencia = vigencia;
        this.proprietario = proprietario;
        this.assegurados = assegurados;
        this.veiculos = veiculos;
    }

    public float getValor() {
        return valor;
    }

    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    public Cliente[] getAssegurados() {
        return assegurados;
    }

    public void setAssegurados(Cliente[] assegurados) {
        this.assegurados = assegurados;
    }
}

