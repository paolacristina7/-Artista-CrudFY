package com.seduc2.crudfy.service;

import com.seduc2.crudfy.entity.Musica;
import com.seduc2.crudfy.repository.ArtistaRepository;
import com.seduc2.crudfy.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistaService {
    @Autowired
    ArtistaRepository ArtistaRepository2;

    public List<Musica> escolherArtista() {
        List<Musica> lista = new ArrayList<>();
        lista = ArtistaRepository2.findAll();
        return lista;
    }
}
