
# 🌪️ Desafio Java - Missões dos Ninjas de Konoha

Este projeto tem como objetivo representar três ninjas da Vila da Folha (Konoha), do universo de *Naruto*, com suas respectivas missões. O desafio envolve uso de variáveis, estruturas condicionais e boas práticas de programação em Java.

## 🧠 Objetivo

Criar um programa em Java que:
- Armazene os dados de **três ninjas** (nome e idade);
- Armazene os dados das **missões atribuídas** (nome, nível de dificuldade e status de conclusão);
- Verifique, com base na idade do ninja, se ele pode concluir a missão;
- Exiba no console todas as informações dos ninjas e das missões.

---

## 📝 Regras do Desafio

Cada ninja deve conter:
- Nome (`String`)
- Idade (`int`)
- Missão:
  - Nome da missão (`String`)
  - Nível de dificuldade (`String`: A, B, C ou D)
  - Status de conclusão (`String`)

### 💡 Lógica de Verificação

Implemente condicionais para verificar se o ninja pode concluir a missão:

- Ninjas **com menos de 15 anos** só podem concluir missões de nível **C ou D**.
- Ninjas **com 15 anos ou mais** podem concluir missões de **qualquer nível**.
- O status da missão deve ser alterado automaticamente para:
  - `"concluída"` ou
  - `"não concluída"`  
de acordo com as regras acima.

---

## ✅ Dicas para Desenvolver

✔️ Identifique os tipos de dados necessários: `String`, `int`, etc.  
✔️ Crie variáveis para cada ninja e missão.  
✔️ Use `System.out.println()` para exibir as informações no console.

---

## ✨ Exemplo de Saída Esperada

```plaintext
Ninja: Naruto Uzumaki
Idade: 16
Missão: Escolta da Princesa
Nível: B
Status: concluída

Ninja: Konohamaru Sarutobi
Idade: 12
Missão: Proteção da Vila
Nível: A
Status: não concluída
```

---

## 🚀 Tecnologias Utilizadas

- Linguagem: **Java**
- IDE recomendada: IntelliJ IDEA, Eclipse ou VS Code com suporte a Java

---

## 🤝 Contribuições

Sinta-se à vontade para abrir **Issues** ou enviar um **Pull Request** com melhorias, sugestões ou correções.

---

## 📄 Licença

Este projeto é de uso educacional e livre para modificações.
