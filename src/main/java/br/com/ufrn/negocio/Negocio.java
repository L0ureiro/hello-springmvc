package br.com.ufrn.negocio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Negocio {
    private List<Proprietario> donos = new ArrayList<>();

    public void adicionarDonos(Proprietario dono) {
        donos.add(dono);
    }

    public List<Proprietario> getDonos() {
        return donos;
    }
    public String message(String name) {
        return name == null ? "world" : name;
    }
}
