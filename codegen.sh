#!/bin/bash

# java -jar swagger/swagger-codegen-cli-3.0.16.jar generate -i swagger/spec.yaml -l spring -c swagger/codegen.conf -Dmodels -Dapis

java -jar swagger/swagger-codegen-cli-3.0.16.jar generate -i swagger/spec.yaml -l spring -c swagger/config.json