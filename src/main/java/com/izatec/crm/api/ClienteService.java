package com.izatec.crm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Criar clientes
    @Transactional
    public void criarClientes() {
        Cliente joao = new Cliente();
        joao.setNome("Joao");
        joao.setAniversario(LocalDate.of(1990, 5, 15));
        joao.setRenda(2500.00);
        joao.setCidade("São Paulo");

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");
        lucas.setAniversario(LocalDate.of(1985, 3, 22));
        lucas.setRenda(3000.00);
        lucas.setCidade("Rio de Janeiro");

        Cliente ana = new Cliente();
        ana.setNome("Ana");
        ana.setAniversario(LocalDate.of(1992, 7, 10));
        ana.setRenda(3500.00);
        ana.setCidade("Belo Horizonte");

        Cliente leticia = new Cliente();
        leticia.setNome("Leticia");
        leticia.setAniversario(LocalDate.of(1992, 7, 10));
        leticia.setRenda(3200.00);
        leticia.setCidade("Porto Alegre");

        Cliente marcos = new Cliente();
        marcos.setNome("Marcos");
        marcos.setAniversario(LocalDate.of(1988, 11, 30));
        marcos.setRenda(2000.00);
        marcos.setCidade("Curitiba");

        clienteRepository.save(joao);
        clienteRepository.save(lucas);
        clienteRepository.save(ana);
        clienteRepository.save(leticia);
        clienteRepository.save(marcos);
    }

    // Buscar cliente por ID
    public Cliente buscarPorId(Integer id) {
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    // Buscar cliente por nome
    public Cliente buscarPorNome(String nome) {
        return clienteRepository.findByNome(nome).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    // Alterar a cidade de João
    @Transactional
    public void alterarCidadeDeJoao() {
        Cliente joao = buscarPorNome("Joao");
        joao.setCidade("Recife");
        clienteRepository.save(joao);
    }

    // Alterar a renda de Lucas
    @Transactional
    public void alterarRendaDeLucas() {
        Cliente lucas = buscarPorNome("Lucas");
        lucas.setRenda(3500.00);
        clienteRepository.save(lucas);
    }

    // Excluir Marcos
    @Transactional
    public void excluirMarcos() {
        Cliente marcos = buscarPorNome("Marcos");
        clienteRepository.delete(marcos);
    }
}

