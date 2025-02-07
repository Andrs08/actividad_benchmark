#!/bin/bash

# Clona el repositorio con los benchmarks
git clone https://github.com/Andrs08/actividad_benchmark.git /benchmark

# Entra al directorio clonado
cd /benchmark/lenguajes

# Crear carpeta de resultados si no existe
mkdir -p /benchmark/resultados

RESULTS_FILE="/benchmark/resultados/tiempos.csv"
echo "Lenguaje,Tiempo (ms)" > $RESULTS_FILE
for lang in */ ; do
    lang_clean=${lang%/} 
    echo "Ejecutando benchmark en $lang_clean"
    docker build -t benchmark-$lang_clean $lang_clean
    tiempo=$(docker run --rm benchmark-$lang_clean)
    echo "$lang_clean,$tiempo" >> $RESULTS_FILE
done

cat $RESULTS_FILE
 
