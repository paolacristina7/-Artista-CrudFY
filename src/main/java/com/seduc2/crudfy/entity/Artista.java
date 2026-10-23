package com.seduc2.crudfy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Artista {
    @Id
    private int id;
    private String nome;
    private String album;
    private Genero Generomusical;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAlbum() {
        return album;
    }

    public Genero getGeneromusical() {
        return Generomusical;
    }

    public Artista(int id, String nome, String album, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.album = album;
        this.Generomusical = genero;
        
    }

    public Artista() {

    }
}