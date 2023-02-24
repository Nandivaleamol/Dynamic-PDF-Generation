package com.assignment.dynamic.pdf.generation.service.impl;

import com.assignment.dynamic.pdf.generation.entity.Invoice;
import com.assignment.dynamic.pdf.generation.respository.InvoiceRepository;
import com.assignment.dynamic.pdf.generation.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return this.invoiceRepository.save(invoice);
    }
}
