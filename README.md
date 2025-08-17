# 🔎 Verificação Formal e Geração de Testes Automáticos para Programas Kotlin

Este repositório apresenta a metodologia proposta no trabalho **ESBMC_eu**, que combina **verificação formal com ESBMC** e **geração automática de casos de teste JUnit** a partir de programas Kotlin.


## 📌 Objetivo
O objetivo é reduzir a barreira de uso da **verificação formal** em software, integrando-a ao fluxo de testes automatizados.  
Dessa forma, desenvolvedores podem **detectar, confirmar e reproduzir violações** de propriedades críticas diretamente em seus pipelines de integração contínua (CI/CD).


## ⚙️ Metodologia

A metodologia segue quatro etapas principais:

1. **Tradução do código Kotlin para C**  
   - O código Kotlin é convertido automaticamente em C com apoio de modelos de linguagem (LLM).  
   - Essa tradução mantém a semântica do programa original, permitindo análise pelo ESBMC.

2. **Verificação formal com ESBMC**  
   - O ESBMC verifica propriedades como:  
     - Overflow / Underflow  
     - Divisão por zero  
     - Acesso fora dos limites  
     - Falhas de asserção  

3. **Geração automática de casos de teste JUnit**  
   - As propriedades encontradas  pelo ESBMC são transformados em **testes executáveis**.  
   - Os testes são criados automaticamente em Kotlin/JUnit.

4. **Execução e validação dos testes**  
   - Os testes são rodados com Gradle/JUnit.  
   - Diferenciam **erros reais** de **falsos positivos**.  
   - Permitem integração direta com ferramentas de cobertura como **Jacoco**.


## 📊 Principais Resultados

- **Nossa abordagem (ESBMC_eu)**  
  - Confirmou todos os erros detectados.  
  - Não gerou casos para Overflow e Underflow (redução na cobertura).  
  - ✅ Diferencial: além da detecção, gera **casos de teste executáveis**, eliminando falsos positivos.  


## 🚀 Como Executar os Experimentos

### 1. Clonar o repositório
```bash
git clone https://github.com/usuario/esbmc_kotlin.git
cd esbmc_kotlin
