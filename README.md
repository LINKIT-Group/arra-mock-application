# ARRA Mock Application

## Description
Simple application which shows one random phrase from Albert Einstein.

## Modules:
- Stateless (Spring Boot)
- Stateful  (Spring Boot + some state)
- Frontend  (Angular app)

## Build 
Each module directory has build.sh script for building module.

## Run localy

For running whole application you need docker-compose and build whole modules before running it.

```./build.sh && docker-compose up```

## Run on heroku

You need create 3 application on heroku for each module.
We use arra-frontend, arra-stateless and arra-stateful.

Then you need push stateless and stateful apps to heroku using heroku cli:
```
cd stateless && heroku container:push web --app arra-stateless
```

```
cd stateful && heroku container:push web --app arra-stateful
```

Set config variables for the frontend application in heroku dashboard like that but with your url to backends

```
SERVER_STATEFUL=https://arra-stateful.herokuapp.com
SERVER_STATELESS=https://arra-stateless.herokuapp.com
```

And now push frontend module to heroku 
```
cd stateless && heroku container:push web --app arra-frontend
```

You can now open applicatin by running ```heroku open --app arra-frontend```

## Jenkins
There is also integration wtih Jenkins pipelines.
