# Dynamic-PDF-Generation
Dynamic PDF Generator

# Problem Statement:

Build a Spring Boot Application with REST API to generate PDF using Java Template Engine.

- Requirement
1 REST API to accept data and generate a PDF based on the received data.

2 Ability to download the above-generated PDF

Use Java Template Engines like Thymeleaf or iText to generate the PDF and store it on
the local storage which can be retrieved later. The input should have a proper schema.

Example
The request body of the API call looks something like this:
{
"seller": "XYZ Pvt. Ltd.",
"sellerGstin": "29AABBCCDD121ZD",
"sellerAddress": "New Delhi, India",
"buyer": "Vedant Computers",
"buyerGstin": "29AABBCCDD131ZD",
"buyerAddress": "New Delhi, India",
"items": [
{
"name": "Product 1",
"quantity": "12 Nos",
"rate": 123.00,
"amount": 1476.00
}
]
}

- PDF Sample

![image](https://user-images.githubusercontent.com/91825705/221169805-277d8ffe-4eca-4535-b7be-76344ae531b0.png)


Note
● Only REST APIs are required. No UI.
● Testable on Postman / Swagger.
● Will prefer properly structured code.
● Will prefer Test Cases (TDD)


# Simple Documentation

Documentation for Spring Boot Application with REST API to Generate PDF using Java Template Engine

Introduction:
This project is a simple implementation of a REST API in Spring Boot that accepts data in a specific format and generates a PDF document based on the received data. The PDF document is generated using iText or Thymeleaf Java Template Engines. The generated PDF document can be downloaded and stored locally.

Requirements:
The project has the following requirements:

A REST API that accepts data in a specific format.
The received data should be used to generate a PDF document.
The PDF document should be generated using either iText or Thymeleaf Java Template Engines.
The generated PDF document should be stored locally and should be retrievable later.
The input data should have a proper schema.
No UI is required, only REST APIs.
The project should be testable on Postman/Swagger.
The code should be properly structured.
Test cases should be implemented using Test Driven Development (TDD).
Dependencies:
The project has the following dependencies:

Spring Boot Starter Web
Spring Boot Starter Data JPA
MySQL Driver
iText PDF
Thymeleaf
Project Structure:
The project structure is as follows:

The controller package contains the InvoiceController class, which is responsible for handling the REST API requests.
The service package contains the InvoiceService class, which is responsible for generating the PDF document.
The repository package contains the InvoiceRepository interface, which is responsible for storing the received data into a MySQL database.
The entity package contains the Invoice class, which represents the received data.
How to Use:
To use the project, follow the steps below:

Clone the project from the GitHub repository.
Open the project in your preferred Java IDE.
Update the MySQL database configuration in the application.properties file.
Build the project using Maven.
Run the project.
Use Postman or Swagger to test the REST API.
The generated PDF document will be stored locally and can be retrieved later.
Conclusion:
This project is a simple implementation of a REST API in Spring Boot that generates a PDF document based on received data. It can be used as a starting point for more complex projects that require generating PDF documents using Java Template Engines.
