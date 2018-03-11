#!/bin/bash

# Podemos quase sempre acrescentar comentários escrevendo um '#' na frente
# Mas existe uma exceção: quando digtamos '#!' na primeira linha
# O que vem imediatamente depois será a caminho do programa que interpretará este script
# Há varios programas que implementam o shell e no nosso caso usamos o bash

# Este script pode ser executad com o comando './basico.sh'

# Vejamos alguma coisas que são possíveis em um script
# Não se esqueça de pesquisar sobre os termos, conceitos, comandos e programas para saber mais
# O 'man' é um ótimo programa: vc pode digigitar no terminal 'man <comando ou programa>'
# Pode começar digitando 'man man' e apertando enter



# Printando...
echo "Podemos printar algo usando o comando 'echo' com o texto em seguida."
echo -n "podemos usar a opção '-n' para printar sem pular linha depois. "
echo -n "E printar "
echo -n "em sequencia "
echo -n "na mesma linha. "
echo -n "E podemos " ; echo -n "separar comandos " ; echo -n "na mesma linha " ; echo -n "com ';'"

# Criando variáveis...
teste=123  # Mesmo números são tratados como strings
vetor=(abc def ghi jkl)

# Usando variáveis...
echo "Podemos printar valores dentro do echo:"
echo "teste = $teste"
echo "Valores do vetor:"
echo "vetor[0] = ${vetor[0]} = $vetor"
echo "vetor[1] = ${vetor[1]}"
echo "Podemos printar o vetor inteiro: vetor = ${vetor[*]}"

# Exportando variáveis de ambiente...
export teste
echo "podemos visualisar todas as variáveis de ambiente (nossas ou do sistema) com o comando 'env'"
env # 'printenv' também faz isso
echo "Algumas merecem mais atenção como a 'PATH', a 'USER', a 'HOME', a 'SHELL'"
echo "O usuário $USUARIO tem a $HOME como sua pasta pessoal"

# Apagando variáveis...
echo "Podemos apagar variáveis usando 'unset'"
unset teste
echo "O mesmo pode ser feito para o vetor inteiro ou somente para um elemento"
unset vetor[1]
echo "vetor sem o elemento de índice 1: vetor = ${vetor[*]}"
unset vetor[*]
echo "Agora a leitura da variável não retorna nada: vetor = ${vetor[*]}"

# Criando aliases...
echo "Podemos criar aliases (apelidos) para comandos que utilizamos frequentemente"
echo "são substituições para nomes que podemos usar na linha de comando ou em scripts"
alias mo='more'
echo "E podemos apagá-los"
unalias mo
echo "para ver os aliases já existente..."
alias

# Criando Funções...
echo "Podemos criar funções. Basta seguir a sintaxe:"
func() {
	cd /
	ls -la
}
echo "Para usá-las basta escrever o nome"
func
echo "É possível fazer isso no terminal: digite 'func(){' e tecle enter para em seguida digitar os comandos"
echo "Podemos ver as funções já criadas, além de aliases e variáveis de ambiente com 'typeset'"
typeset
typeset -f # apenas as funções

echo "Para aliases e funções persistirem temos que adiciona-los em um arquivo de configuração como o .bashrc"

