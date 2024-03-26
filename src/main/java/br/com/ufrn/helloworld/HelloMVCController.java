package br.com.ufrn.helloworld;

import br.com.ufrn.negocio.Proprietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.ufrn.negocio.Negocio;

@Controller
public class HelloMVCController {

    @Autowired
    private Negocio negocio;

    @GetMapping("/hellomvc")
    public String showForm(Model model) {
        model.addAttribute("proprietario", new Proprietario());
        return "form";
    }

    @PostMapping("/addProprietario")
    public String addNegocio(@ModelAttribute Proprietario dono) {
        negocio.adicionarDonos(dono);
        return "redirect:/hellomvc";
    }

    @GetMapping("/listProprietarios")
    public String listNegocios(Model model) {
        model.addAttribute("donos", negocio.getDonos());
        return "list";
    }
}

