package com.example;

import com.sparkpost.Client;
import com.sparkpost.exception.SparkPostException;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws SparkPostException {

        String API_KEY = "d6aef2bac19506d9099e53e16d2ae0b399288fc9";
        Client client = new Client(API_KEY);
        client.sendMessage(
                "usuario1@albamch.es",
                "albamolerachacon@gmail.com",
                "The subject of the message",
                "The text part of the email",
                "<b>The HTML part of the email</b>");
    }
}
