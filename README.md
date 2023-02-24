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
