/*
 * Copyright 2020 Maritime Connectivity Platform Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.maritimeconnectivity.rootcalist.client;

import io.swagger.client.ApiException;
import io.swagger.client.api.RootCaControllerApi;
import io.swagger.client.model.RootCA;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Stream;

@Slf4j
public class Main {

    public static void main(String[] args) {
        CommandLineParser parser = new DefaultParser();
        Options options = setupOptions();
        CommandLine cmd;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            log.error("Parsing failed.", e);
        }
    }

    public static Options setupOptions() {
        Options options = new Options();

        // Help
        options.addOption("h", "help", false, "Show this help message");

        return options;
    }

    public static void createRootCA(String certPath) {
        File certFile = new File(certPath);
        if (certFile.exists()) {
            StringBuilder stringBuilder = new StringBuilder();
            try (Stream<String> lines = Files.lines(certFile.toPath(), StandardCharsets.UTF_8)) {
                lines.forEach(stringBuilder::append);
            } catch (IOException e) {
                log.error("Could not open file");
            }
            String certificate = stringBuilder.toString();
            RootCaControllerApi rootCaControllerApi = new RootCaControllerApi();
            try {
                RootCA rootCA = rootCaControllerApi.createRootCAUsingPOST(certificate);
                if (rootCA != null) {
                    log.info("New root CA was successfully created:\n{}", rootCA.toString());
                }
            } catch (ApiException e) {
                log.error("Creation of root CA failed with following message {} and HTTP status code {}", e.getResponseBody(), e.getCode());
            }
        } else {
            log.error("File {} does not exist", certPath);
        }
    }
}
