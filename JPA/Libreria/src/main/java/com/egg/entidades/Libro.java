package com.egg.entidades;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "libro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l")
    , @NamedQuery(name = "Libro.findByIsbn", query = "SELECT l FROM Libro l WHERE l.isbn = :isbn")
    , @NamedQuery(name = "Libro.findByAlta", query = "SELECT l FROM Libro l WHERE l.alta = :alta")
    , @NamedQuery(name = "Libro.findByAnio", query = "SELECT l FROM Libro l WHERE l.anio = :anio")
    , @NamedQuery(name = "Libro.findByEjemplares", query = "SELECT l FROM Libro l WHERE l.ejemplares = :ejemplares")
    , @NamedQuery(name = "Libro.findByEjemplaresprestados", query = "SELECT l FROM Libro l WHERE l.ejemplaresprestados = :ejemplaresprestados")
    , @NamedQuery(name = "Libro.findByEjemplaresrestantes", query = "SELECT l FROM Libro l WHERE l.ejemplaresrestantes = :ejemplaresrestantes")
    , @NamedQuery(name = "Libro.findByTitulo", query = "SELECT l FROM Libro l WHERE l.titulo = :titulo")})
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ISBN")
    private Long isbn;
    @Column(name = "ALTA")
    private Boolean alta;
    @Column(name = "AÑO")
    private Integer anio;
    @Column(name = "EJEMPLARES")
    private Integer ejemplares;
    @Column(name = "EJEMPLARESPRESTADOS")
    private Integer ejemplaresprestados;
    @Column(name = "EJEMPLARESRESTANTES")
    private Integer ejemplaresrestantes;
    @Column(name = "TITULO")
    private String titulo;
    @JoinColumn(name = "AUTOR_ID", referencedColumnName = "ID")
    @ManyToOne
    private Autor autor;
    @JoinColumn(name = "EDITORIAL_ID", referencedColumnName = "ID")
    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

    public Libro(Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresprestados, Integer ejemplaresrestantes, Boolean alta, Autor autorId, Editorial editorialId) {
        this.isbn = isbn;
        this.alta = alta;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresprestados = ejemplaresprestados;
        this.ejemplaresrestantes = ejemplaresrestantes;
        this.titulo = titulo;
        this.autor = autorId;
        this.editorial = editorialId;
    }

    

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresprestados() {
        return ejemplaresprestados;
    }

    public void setEjemplaresprestados(Integer ejemplaresprestados) {
        this.ejemplaresprestados = ejemplaresprestados;
    }

    public Integer getEjemplaresrestantes() {
        return ejemplaresrestantes;
    }

    public void setEjemplaresrestantes(Integer ejemplaresrestantes) {
        this.ejemplaresrestantes = ejemplaresrestantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        return !((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn)));
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", alta=" + alta + ", anio=" + anio + ", ejemplares=" + ejemplares + ", ejemplaresprestados=" + ejemplaresprestados + ", ejemplaresrestantes=" + ejemplaresrestantes + ", titulo=" + titulo + ", autorId=" + autor + ", editorialId=" + editorial + '}';
    }

    
    
}
