package com.beer.beer.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ses.SesClient;
import software.amazon.awssdk.services.ses.model.*;

@RestController
@RequestMapping("/emailtest")
public class SESController {
    private final String SENDER = "malin.e.kraft@gmail.com";
    private final String TO = "malin.e.kraft@gmail.com";
    private final String SUBJECT = "Kokeile näitä oluita kovaan janoon";
    private final String message = "Oispa kaljaa!";

    // TODO Pitää rakentaa lähetettävä message suosituksista.
    // TODO Pitää rakentaa lähetettävän viestin SUBJECT
    // TODO Pitää lähettää suositukset useampaan osoitteeseen.

    private final SesClient sesClient = SesClient.builder()
            .region(Region.EU_CENTRAL_1)
            .build();

    @GetMapping("")
    String sendSES() {
        SendEmailRequest.builder();

        SendEmailRequest sendEmailRequest = SendEmailRequest.builder()
                .destination(Destination.builder()
                        .toAddresses(TO)
                        .build())
                .message(Message.builder()
                        .body(Body.builder()
                                .text(Content.builder()
                                        .data(message)
                                        .build())
                                .build())
                        .subject(Content.builder()
                                .data(SUBJECT)
                                .build())
                        .build())
                .source(SENDER)
                .build();

        sesClient.sendEmail(sendEmailRequest);
        return "";
    }

}
