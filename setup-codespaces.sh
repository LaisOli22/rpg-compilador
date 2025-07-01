
echo "Configurando ambiente do RPG Compilador..."

# Criar diretórios necessários
mkdir -p bin
mkdir -p lib
mkdir -p src/antlr

# Verificar se os JARs necessários existem
if [ ! -f "lib/antlr-4.13.2-complete.jar" ]; then
    echo "⚠️  ATENÇÃO: antlr-4.13.2-complete.jar não encontrado em lib/"
    echo "   Faça o download em: https://www.antlr.org/download.html"
fi

if [ ! -f "lib/antlr-runtime-4.13.2.jar" ]; then
    echo "⚠️  ATENÇÃO: antlr-runtime-4.13.2.jar não encontrado em lib/"
    echo "   Faça o download em: https://www.antlr.org/download.html"
fi

if [ ! -f "lib/gson-2.6.2.jar" ]; then
    echo "⚠️  ATENÇÃO: gson-2.6.2.jar não encontrado em lib/"
    echo "   Faça o download em: https://repo1.maven.org/maven2/com/google/code/gson/gson/2.6.2/"
fi

# Verificar se existe a gramática ANTLR
if [ ! -f "src/antlr/Expr.g4" ]; then
    echo "⚠️  ATENÇÃO: Arquivo de gramática Expr.g4 não encontrado em src/antlr/"
fi

echo "Configuração do ambiente concluída!"
echo ""
echo "Para usar o projeto:"
echo "   1. Pressione Ctrl+Shift+P"
echo "   2. Digite 'Tasks: Run Task'"
echo "   3. Escolha uma das tarefas disponíveis"
echo ""
echo "Tarefas disponíveis:"
echo "   - Gerar ANTLR"
echo "   - Compilar projeto"
echo "   - Executar Main"
