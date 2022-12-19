package vv.huong.Order.Service.MCA.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vv.huong.Order.Service.MCA.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

}
