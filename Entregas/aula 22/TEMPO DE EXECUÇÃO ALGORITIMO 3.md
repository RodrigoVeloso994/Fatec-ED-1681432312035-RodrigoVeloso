# CALCULO DE TEMPO DE EXECUÇÃO - ALGORITIMO 3

CONSIDERANDO QUE X ESTA EM A[1..n]

```http
Esq = 1
Dir = 1
Enquanto Esq <= Dir faça
    Meio = (Esq + Dir) / 2
    Se  A[Meio] == x então
        Devolve Meio
    Senao se x > A[meio] então
        Esq = meio + 1
    Senao
        Dir = meio + 1
Devolva -1
```

## CONTAGEM DE INSTRUÇÃO POR LINHA
```http
LINHA 1: executa 1 vez
LINHA 2: executa 1 vez
LINHA 3: executa Px vezes
LINHA 4: executa Px vezes
LINHA 5: executa Px vezes
LINHA 6: executa 1 vez
LINHA 7: Px - 1
LINHA 8: Px - 1
LINHA 9: Px - 1
```

## TEMPO TOTAL

```http
Tble(n) = 2T + Tpx + 4Tpx + 2Tpx + 2T(Px - 1) + 2T(Px - 1) + T
= 2T + 7Tpx + 2Tpx - 2T + 2Tpx - 2T + T
= 11Tpx - T
```