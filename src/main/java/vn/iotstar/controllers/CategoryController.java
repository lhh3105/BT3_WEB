package vn.iotstar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.iotstar.Services.CategoryService;
import vn.iotstar.entity.Category;
@Controller
@RequestMapping("/admin/categories")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("")
	public String all(Model model) {
		List<Category> list = categoryService.findAll();
		model.addAttribute("list",list);
		
		return "admin/category/list";
	}
	
	@GetMapping("/new")
	 public String showNewForm(Model model) {
	     model.addAttribute("category", new Category());
	     return "admin/category/form";
	 }

	@PostMapping("/save")
	public String saveCategory(Category category) {
	     categoryService.save(category);
	     return "redirect:/categories";
	 }

	@GetMapping("/edit/{id}")
	public String showEditForm(@PathVariable("id") Integer id, Model model) {
	    model.addAttribute("category", categoryService.findById(id).orElseThrow());
	     return "admin/category/form";
	}

	@GetMapping("/delete/{id}")
	public String deleteCategory(@PathVariable("id") Integer id) {
	     categoryService.deleteById(id);
	     return "redirect:/categories";
	}
  

}
