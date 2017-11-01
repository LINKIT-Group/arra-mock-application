#!/bin/sh

echo "# Gradle clean"
./gradlew clean 

echo "# Gradle test"
./gradlew test

echo "# Gradle build"
./gradlew build

