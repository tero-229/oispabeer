package com.beer.beer.controllers;

import com.beer.beer.Entities.BeerUser;
import com.beer.beer.services.BeerService;
//import com.beer.beer.services.UserService;
import com.beer.beer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ses.SesClient;
import software.amazon.awssdk.services.ses.model.*;

import java.util.List;

@RestController
@RequestMapping("/emailtest")
public class SESController {
    @Autowired
    BeerService beerService;
    @Autowired
    UserService userService;

    private final String SENDER = "malin.e.kraft@gmail.com";
    private final String SUBJECT = "Kokeile näitä oluita kovaan janoon";


    // TODO Pitää rakentaa lähetettävän viestin SUBJECT

    private final SesClient sesClient = SesClient.builder()
            .region(Region.EU_CENTRAL_1)
            .build();

    @GetMapping("")
    String sendSES() {
        String message = beerService.getBestBeersAsString();
        SendEmailRequest sendEmailRequest = SendEmailRequest.builder()
                .destination(Destination.builder()
                        //.toAddresses(TO)
                        .toAddresses(userService.getUsersEmail())
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
