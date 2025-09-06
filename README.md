![thumbnail-Formação Java (3)](https://user-images.githubusercontent.com/66698429/226652162-77d758f2-3d34-4f6d-bb9b-37b3c00d0759.png)


# Java: trabalhando com listas e coleções de dados

Este repositório contém meus estudos e aprendizados do curso **Java: Listas e coleções de dados (Alura)**.  
Criamos um projeto prático para aplicar os conceitos.  

---

## 📚 Principais aprendizados  

1. **Ordenação de listas com `Collections.sort`**  
   - Ordenar listas simples (Strings, números) e também listas de objetos personalizados.
    <img width="350" height="55" alt="image" src="https://github.com/user-attachments/assets/eeaef84d-e9fd-41f3-b068-d699ca2f5bbf" />


2. **Implementação da interface `Comparable`**  
   - Necessária para ordenar corretamente objetos de uma classe criada no projeto.  
   - Exemplo: a classe `Compra` implementando `Comparable` para ordenar por descrição ou valor.
    <img width="350" height="148" alt="image" src="https://github.com/user-attachments/assets/fb0bf672-03a1-4c2c-bf2c-a13588c0a16c" />
  <img width="450" height="75" alt="image" src="https://github.com/user-attachments/assets/291e7ebc-5c08-47f3-a655-59ab7993d930" />


3. **Método `compareTo`**  
   - Especifica a lógica de comparação entre dois objetos.  
   - Exemplo: comparar dois Ttulos pelo nome ou por valor (nesse caso não seria possível).
   - Exemplo:
      Retorna 0 se forem iguais.
      Retorna < 0 se o objeto atual for “menor”.
      Retorna > 0 se o objeto atual for “maior”.
  <img width="400" height="55" alt="image" src="https://github.com/user-attachments/assets/47a0d75b-cfc6-42d4-9006-42bad486884f" />

  
4. **Ordenação flexível com `Comparator`**  
   - Além de `Comparable`, também é possível usar `Comparator` para ordenar com critérios diferentes.
  <img width="450" height="60" alt="image" src="https://github.com/user-attachments/assets/5fbfcb53-ed35-42db-a8a9-50492abf44a3" />


5. **Polimorfismo com a interface `List`**  
   - Permite declarar como `List<T>` para poder trocar implementação facilmente por `ArrayList<T>` ou `LinkedList<T>`, dando flexibilidade ao código.  

6. **Diferença entre `ArrayList` e `LinkedList`:** 
   - `ArrayList`: mais rápido para acesso direto.  
   - `LinkedList`: mais eficiente em inserções e remoções no meio da lista.

7. **Organização de código e boas práticas**   
   - Criar pacotes para organizar melhor o código.  



