# ARRA Mock Application

## Description
Simple application which shows one random phrase from Albert Einstein.

## Modules:
- Stateless (Spring Boot)
- Stateful  (Spring Boot + some state)
- Frontend  (Angular app)

## Build 
Each module directory has build.sh script for building module.

## Run
For running whole application you need docker-compose and build whole modules before running it.

```./build.sh && docker-compose up```

## Jenkins
There is also integration wtih Jenkins pipelines.
