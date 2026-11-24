package com.fireguard;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlertController {

    @PostMapping("/api/whatsapp")
    public String triggerWhatsApp(@RequestParam String message) {
        // This receives the request from your HTML dashboard and triggers the Java WhatsApp code
        System.out.println("Backend received alert request: " + message);
        WhatsAppService.sendWhatsAppAlert(message);
        return "Alert triggered!";
    }
}