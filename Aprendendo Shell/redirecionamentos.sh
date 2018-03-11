#!/bin/bash

# Capturar a saída de um comando colocando ele entre crases
dir_atual=`pwd`
data=`date +%d%m%Y`
data_segs=`date +%S:%M:%H-%d%m%Y`
segundo_atual=`date +%s`
user=`whoami`

# Redirecionar saídas de comendos e programas para arquivos
ls -al > lista_$segundo_atual # '>'  Passa listagem para um arquivo novo. Se já existir é sobrescrito
ls -al >> lista                 # '>>' Anexa ao final do arquivo. Se não existir é criado

# Passar o conteúdo de um arquivo para um comando ou programa
wc < lista # Passa o conteúdo de 'lista' para o 'wc' (word count)

# Redirecionamento inline
wc << EOF  # Abre prompt secundário para digitar o texto que vai para 'wc'. Termina quando digitar-se a linha EOF


