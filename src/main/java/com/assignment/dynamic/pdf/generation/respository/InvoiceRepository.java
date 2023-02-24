package com.assignment.dynamic.pdf.generation.respository;

import com.assignment.dynamic.pdf.generation.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

}
