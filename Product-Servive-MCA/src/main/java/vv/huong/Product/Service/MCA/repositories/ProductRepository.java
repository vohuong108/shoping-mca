package vv.huong.Product.Service.MCA.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import vv.huong.Product.Service.MCA.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
