package id.dian.latihanspring.modulsatu.controller;

import id.dian.latihanspring.modulsatu.dao.ProductDao;
import id.dian.latihanspring.modulsatu.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/product")
public class ProductApiController {
    @Autowired private ProductDao productDao;

    @GetMapping("/")
    public Page<Product> findProducts(Pageable page){
        return productDao.findAll(page);
    }
}
