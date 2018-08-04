#!/bin/bash

# Script de tarefas de inicialzação do Desktop de autoria de Renan Passos.
# Sinta-se livre para adptar ao seu uso.

# Para utilizar, siga os passos:
#
# Mova uma cópia do script para o diretório /etc/init.d,
# Dê permissões de execução ao script:
# 	sudo chmod 755 /etc/init.d/iniciar.sh
# Configure o script para rodar na inicialização:
# 	update-rc.d /etc/init.d/iniciar.sh defaults
# Retire o script da inicialização quando quiser, com o comando:
# 	update-rc.d iniciar.sh remove


# Monta a partição Linux com dados:
sudo mkdir -p /media/humano/c8bc5d06-42d1-4865-8f7e-b4d441f309af
sudo mount /dev/sdb7 /media/humano/c8bc5d06-42d1-4865-8f7e-b4d441f309af

