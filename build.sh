#!/bin/sh

modules=(stateless stateful frontend)

for item in ${modules[*]}
do
    printf " Build module:  %s\n" $item 
    cd $item
    ./build.sh
    cd ..
done

