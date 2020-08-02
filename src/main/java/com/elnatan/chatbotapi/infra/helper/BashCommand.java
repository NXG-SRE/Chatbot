package com.elnatan.chatbotapi.infra.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Inspired by: https://mkyong.com/java/how-to-execute-shell-command-from-java/
 */
public class BashCommand {
    public static String getHostname() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", "hostname");

        Process process = processBuilder.start();
        StringBuilder output = new StringBuilder();
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line);
        }

        process.waitFor();
        return output.toString();
    }
}
