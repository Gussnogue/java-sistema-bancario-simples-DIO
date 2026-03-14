# 💻 Desafio de Projeto – Programação Orientada a Aspectos (AspectJ + Java)

[![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/)
[![AspectJ](https://img.shields.io/badge/AspectJ-1.9.x-blue)](https://www.eclipse.org/aspectj/)
[![OOP](https://img.shields.io/badge/Paradigma-Orientado%20a%20Objetos-green)](https://pt.wikipedia.org/wiki/Orientação_a_objetos)
[![AOP](https://img.shields.io/badge/Paradigma-Orientado%20a%20Aspectos-purple)](https://pt.wikipedia.org/wiki/Programação_orientada_a_aspecto)
[![Cross-cutting](https://img.shields.io/badge/Cross--cutting-Concern-yellow)](https://en.wikipedia.org/wiki/Cross-cutting_concern)
[![Logging](https://img.shields.io/badge/Logging-Erro%20de%20Saldo-red)](https://www.slf4j.org/)
[![DIO](https://img.shields.io/badge/DIO-Desafio%20de%20Projeto-lightgrey)](https://www.dio.me/)
[![License](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)

Este repositório contém a implementação do desafio **“Desenvolvendo um Projeto com o Paradigma de Programação Orientado a Aspectos”**, utilizando **Java** e **AspectJ**.  

---

## 🎯 Objetivo do Projeto
- Implementar um sistema bancário simples em **Paradigma Orientado a Objetos (POO)**.  
- Criar uma **funcionalidade transversal** (cross-cutting concern) com **Paradigma Orientado a Aspectos (POA)**.  
- Exemplo: verificação de saldo insuficiente em **todas as contas**, utilizando **AspectJ**.  

---

## 📌 Problema Proposto
Em um sistema bancário, o cliente pode realizar saques em diferentes tipos de contas:  
- Conta Corrente  
- Conta Salário  
- Conta Poupança  
- Conta Investimento  

Ao tentar sacar, o sistema deve verificar se há **saldo suficiente**.  
Caso não haja, deve ser gerado um **log de erro** (mensagem de “Saldo insuficiente”).  

---

## 🛠️ Tecnologias Utilizadas
- **Java JDK 17+**  
- **AspectJ 1.9.x** (compilador `ajc`)  
- **VS Code** (ou qualquer IDE Java)  

---
