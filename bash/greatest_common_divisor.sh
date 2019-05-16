#!/bin/bash

gcd () {

    if [ $2 -eq 0 ]; then
        echo $1
    elif [ $1 -eq 0 ]; then
        echo $2
    else

        if [ $1 -gt $2 ]; then
            echo $(gcd $[$1 - $2] $2)
        else
            echo $(gcd $1 $[$2 - $1])
        fi
          
    fi
}

read -p 'Enter a: ' a
read -p 'Enter b: ' b

gcd $a $b