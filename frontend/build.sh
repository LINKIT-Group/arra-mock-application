#!/bin/sh

echo "# NPM Install"
npm install

echo "\n# Ng lint"
ng lint

echo "\n# Ng test"
ng test --watch=false

echo "\n# Ng build"
ng build -prod
