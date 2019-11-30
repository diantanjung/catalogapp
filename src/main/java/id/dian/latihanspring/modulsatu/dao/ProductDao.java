package id.dian.latihanspring.modulsatu.dao;

import id.dian.latihanspring.modulsatu.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String> {
}
