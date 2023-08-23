# CALCULANDO O TEMPO DE EXECUÇÃO - Algoritmo 1

Considerando que x esta em A[1..n]

```http
Function BuscaLinerar(A,n,x){
i = 1
Enquanto i <= n faça
    Se A[i] == x então
        Devolva i
    i= i + 1
Devolva-1
}
```

## CONTANDO AS INSTRUÇÕES POR LINHA
```http
Linha 1: executa 1 vez
Linha 2: executa Px vezes
Linha 3: executa Px vezes
Linha 4: executa 1 vez
Linha 5: Px - 1
```

## TEMPO TOTAL, 1ª E ULTIMA POSIÇÃO

Tempo total:
```http
Tble(n) = T + Tpx + 2Tpx + 2T(Px - 1) + T
= 2T + 3Tpx + 2Tpx - 2T
= 5Tpx
```

1ª POSIÇÃO: 
```http
Tble(n) = T + T*1 + 2T*1 + 2T(1 - 1) + T
= 2T + 2T + 2T - 2T + T
= 5T
```

ULTIMA POSIÇÃO: 
```http
5T * n
= 5Tn
```