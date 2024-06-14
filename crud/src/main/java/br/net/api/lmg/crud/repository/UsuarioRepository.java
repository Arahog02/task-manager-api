package br.net.api.lmg.crud.repository;


import br.net.api.lmg.crud.model.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    public Optional<Usuario> findByEmail(String email);
    public Optional<Usuario> findByEmailAndSenha(String email, String senha);
}
