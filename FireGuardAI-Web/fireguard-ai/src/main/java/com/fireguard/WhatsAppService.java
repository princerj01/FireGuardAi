package com.fireguard;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class WhatsAppService {

    // 🛑 IMPORTANT: Replace these with your actual CallMeBot details!
    private static final String PHONE_NUMBER = "YOUR_PHONE_NUMBER"; // e.g., 919876543210 (No '+' sign)
    private static final String API_KEY = "YOUR_API_KEY"; // The 6-digit pin the bot gave you on WhatsApp

    public static void sendWhatsAppAlert(String alertMessage) {
        try {
            // Encode the message so spaces and emojis work in the URL
            String encodedMessage = URLEncoder.encode(alertMessage, "UTF-8");
            
            String urlString = "https://api.callmebot.com/whatsapp.php?phone=" 
                    + PHONE_NUMBER + "&text=" + encodedMessage + "&apikey=" + API_KEY;
            
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                System.out.println("✅ WhatsApp Alert Sent Successfully!");
            } else {
                System.out.println("❌ Failed to send WhatsApp Alert. Response Code: " + responseCode);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}