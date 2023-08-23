# CALCULANDO TEMPO DE EXECUÇÃO - ALGORITIMO 2

Considerando que x esta em A[1..n]

```http
Function BuscaLinerarEmOrdem(A,n,x)
i=1
enquanto i <= e x >= A[i] faça
    Se A[i]== x então
        Devolva i
    i= i + 1
Devolva -1
```

## CONTAGEM DE INSTRUÇÃO POR LINHA
```http
LINHA 1: executa 1 vez
LINHA 2: executa Px vezes
LINHA 3: executa Px vezes
LINHA 4: executa 1 vez
LINHA 5: Px - 1
```

## TEMPO TOTAL, 1ª E ULTIMA POSIÇÃO

TEMPO TOTAL:
```http
Tble(n) = T + 4Tpx + 2Tpx + 2T(Px - 1) + T
= 2T + 6Tpx + 2Tpx - 2T
= 8Tpx
```

1ª POSIÇÃO: 
```http
Tble(n) = T + 4T*1 + 2T*1 + 2T(1 - 1) + T
= 5T + 2T + 2T - 2T + T
= 8T
```

ULTIMA POSIÇÃO: 
```http
8T * n
= 8Tn
```