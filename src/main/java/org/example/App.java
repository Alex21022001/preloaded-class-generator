package org.example;

import java.nio.file.Path;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> groupNames = List.of("/aws/lambda/tg-handler", "/aws/lambda/ws-handler", "/aws/lambda/lifecycle-handler");
        Path output = Path.of("quarkus-preload-classes.txt");
        Integer limit = 3;

        LogService logService = new LogService(groupNames, output, limit);
        logService.generateClasses();
    }
}
