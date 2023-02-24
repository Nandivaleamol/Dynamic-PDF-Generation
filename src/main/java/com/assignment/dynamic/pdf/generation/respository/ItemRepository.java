package com.assignment.dynamic.pdf.generation.respository;

import com.assignment.dynamic.pdf.generation.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
