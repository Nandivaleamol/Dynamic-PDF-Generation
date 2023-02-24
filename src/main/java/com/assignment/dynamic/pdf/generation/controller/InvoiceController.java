package com.assignment.dynamic.pdf.generation.controller;

import com.assignment.dynamic.pdf.generation.entity.Invoice;

import com.assignment.dynamic.pdf.generation.service.InvoiceService;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;

import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping("/invoice")
    public ResponseEntity<byte[]> generateInvoicePdf(@RequestBody Invoice invoice) throws IOException {
        // Generate HTML from Thymeleaf template
        String html = generateHtml(invoice);
        // Generate PDF from HTML using iText
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(outputStream);
        PdfDocument pdf = new PdfDocument(writer);
        //convert html to pdf
        ConverterProperties props = new ConverterProperties();
        HtmlConverter.convertToPdf(html, pdf, props);
        // Return PDF as byte array with appropriate headers
        byte[] pdfBytes = outputStream.toByteArray();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);

        //add to random suffix to pdf name
        String fileSuffix = UUID.randomUUID().toString();
        headers.setContentDispositionFormData("invoice.pdf", "invoice"+fileSuffix+".pdf");
        headers.setContentLength(pdfBytes.length);

        // save the invoice details in db
        invoiceService.saveInvoice(invoice);
        return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
    }

    private String generateHtml(Invoice invoice) {
        // Load Thymeleaf template
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode(TemplateMode.HTML);
        TemplateEngine engine = new TemplateEngine();
        engine.setTemplateResolver(resolver);
//        IContext context = new Context(Locale.getDefault());
        Context context = new Context(Locale.getDefault());
        context.setVariable("invoice", invoice);
        // Process template with data to generate HTML
        return engine.process("invoice", context);
    }
}
