package br.com.produtos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.produtos.model.Produto;
import br.com.produtos.repository.ProdutosRepository;

@Controller
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository repository;
	
	@GetMapping("/")
	public String inicio() {
		return "/listaProdutos";
	}
	
	@GetMapping("/listaProdutos")
	public String listar(Model model) {
		
		System.out.println("ENTROU NO MÉTODO");

		List<Produto> produtos = repository.findAll();

		model.addAttribute("produto", produtos);

		return "listaProdutos";
	}
	
	@GetMapping("/produto")
	public String novo(Model model) {

		model.addAttribute("produto", new Produto());

		return "produto";
	}
	
	@PostMapping("/salvarProduto")
	public String salvar(@ModelAttribute Produto produto) { // Recebe os dados enviados pelo formulário.

		repository.save(produto); // Salva no banco. O JPA salva o aluno no banco.

		return "redirect:/produto"; // Após salvar:
									// volta para a listagem;
									// evita duplicação ao atualizar a página.
	}

}
