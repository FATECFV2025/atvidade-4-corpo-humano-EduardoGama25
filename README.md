# Conclusões

## Teste 1:
**Instrução:** Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1.<br>
**Pergunta:** Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?<br>
**Saída:**
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The field CorpoHumano.massa is not visible

        at main.java.App.main(App.java:30)
```

**Resposta:** Houve um erro de compilação, pois o compilador identificou que o atributo massa da classe CorpoHumano possui um modificador de acesso do tipo private que restringe o acesso e a alteração direta do atributo.


## Teste 2:
**Instrução:** Na classe Corpo_Humano altere a linha private float Massa para public float Massa.<br>
**Pergunta:** Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?<br>
**Saída:**
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        Type mismatch: cannot convert from String to double

        at main.java.App.main(App.java:35)
```

**Resposta:** Houve um erro de compilação, pois apesar da alteração do modificador de acesso para public, permitindo a interação direta do App com o atributo, o valor definido ao atributo não corresponde ao mesmo tipo definido pela classe, já que o uso de aspas indica que o valor é do tipo String, quando deveria ser double.


## Teste 3:
**Instrução:** Na classe CorpoHumano altere a linha public setVolume (float volume) para private setVolume (float volume).<br>
**Pergunta:** Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?<br>
**Saída:**
```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        The method setVolume(double) from the type CorpoHumano is not visible

        at main.java.App.main(App.java:38)
```

**Resposta:** Houve um erro de compilação, pois assim como no primeiro teste o compilador impediu o acesso, uma vez que o elemento chamado (no caso o método Setter do atributo volume) tinha um modificador de acesso private, que restringia a interação com esse método, limitando a utilização dele apenas na própria classe.