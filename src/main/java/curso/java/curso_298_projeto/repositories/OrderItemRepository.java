package curso.java.curso_298_projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.java.curso_298_projeto.entities.OrderItem;
import curso.java.curso_298_projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}