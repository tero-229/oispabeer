/*
package com.beer.beer.controllers;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ses.SesClient;
import software.amazon.awssdk.services.ses.model.*;

public class SESController {
    private final String SENDER = "malin.e.kraft@gmail.com";
    private final String TO = "malin.e.kraft@gmail.com";
    private final String SUBJECT = "Kokeile näitä oluita kovaan janoon";
    private final String message = "Oispa kaljaa!";

    private final SesClient sesClient = SesClient.builder()
            .region(Region.EU_WEST_1.EU_CENTRAL_1)
            .build();

    String sendSES() {
        SendEmailRequest.builder();

        SendEmailRequest.builder()
                .destination(new Destination().)
                .message(message).
*/
/*        SendEmailRequest request = new SendEmailRequest()
                .withDestination(new Destination().withToAddresses(TO))
                .withMessage(new Message().withBody(new Body().withText(new Content()
                                        .withCharset("UTF-8").withData(message)))
                        .withSubject(new Content().withCharset("UTF-8").withData(SUBJECT)))
                .withSource(SENDER).builder();*//*


        sesClient.sendEmail();
        return "";
    }

}
*/
