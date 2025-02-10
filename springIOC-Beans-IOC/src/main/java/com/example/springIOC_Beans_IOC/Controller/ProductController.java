
package com.example.springIOC_Beans_IOC.Controller;

import com.example.springIOC_Beans_IOC.Entity.Product;
import com.example.springIOC_Beans_IOC.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")  // Base path
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/new")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/productForm")
    public String showForm(Model model) {
        model.addAttribute("adds", new Product());
        return "product";
    }

    @PostMapping("/saveProduct")
    public String createForm(@ModelAttribute("adds") Product product) {
        productService.saveProduct(product); // Calls service layer
        return "redirect:/products/view-productList";
    }

    @GetMapping("/view-productList")
    public String showProductList(Model model) {
        model.addAttribute("products", productService.getAllProducts()); // Calls service layer
        return "product-list";
    }
}

