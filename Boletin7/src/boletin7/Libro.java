/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author Arasa
 */
public class Libro {
    private String titulo,autor;
    private int exem, prest;
    public Libro() {
    }
    public Libro(String titulo, String autor, int exem, int pret) {
        this.titulo = titulo;
        this.autor = autor;
        this.exem = exem;
        this.prest = pret;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getExem() {
        return exem;
    }

    public void setExem(int exem) {
        this.exem = exem;
    }

    public int getPrest() {
        return prest;
    }

    public void setPrest(int pret) {
        this.prest = pret;
    }
    public boolean prestamento(){
        if (exem>0){
            exem-=1;
            prest+=1;
            return true;
        }else{
            return false;
        }
    }
    public boolean devolvemento(){
        if (prest>0){
            prest-=1;
            exem+=1;
            return true;
        }else{
            return false;
        }
    }
    public String toString (){
		String mensaje="El titulo es "+titulo+" ,escrito por "+autor+" , hay "+exem+" ejemplares y " +
				+prest+" libros prestados";
		return mensaje;
	}
}
