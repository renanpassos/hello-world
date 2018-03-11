#!/bin/bash

# Fazer contas no Shell

var1=2
var2=4

var3=$[$var1+$var2+10*10]

echo "$var3"

# Calculando com bc (bash calculator)
var=`echo "scale=2;2/5" | bc`
echo "$var"

