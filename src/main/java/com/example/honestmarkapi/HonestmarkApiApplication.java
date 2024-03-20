package com.example.honestmarkapi;

import com.example.honestmarkapi.api.CrptApi;


import java.time.Duration;

public class HonestmarkApiApplication {
    public static void main(String[] args) {
        CrptApi.Description description = new CrptApi.Description();
        description.setParticipantInn("1234567890");

        CrptApi.Product product1 = new CrptApi.Product();
        product1.setCertificate_document("Certificate1");
        product1.setCertificate_document_date("2022-01-01");

        CrptApi.Product product2 = new CrptApi.Product();
        product2.setCertificate_document("Certificate2");
        product2.setCertificate_document_date("2022-02-01");

        CrptApi.Product[] products = {product1, product2};

        CrptApi.Document document = new CrptApi.Document();
        document.setDescription(description);
        document.setDoc_id("123");
        document.setDoc_status("Pending");
        document.setDoc_type("Type1");
        document.setImportRequest(true);
        document.setOwner_inn("9876543210");
        document.setParticipant_inn("1234567890");
        document.setProducer_inn("9876543210");
        document.setProduction_date("2022-01-01");
        document.setProduction_type("Type2");
        document.setProducts(products);
        document.setReg_date("2022-01-01");
        document.setReg_number("456");

        CrptApi crptApi = new CrptApi(Duration.ofSeconds(1), 5);
        crptApi.createDocument(document, "signature");
    }
}