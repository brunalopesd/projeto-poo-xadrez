#include <stdio.h>
#include <stdlib.h>
#define ERRO_FILA_CHEIA -1
#define ERRO_FILA_VAZIA -2


typedef struct {
int *dados;
int capacidade;
int inicio, fim, num_ele; // num_ele eh usado para saber se esta cheia ou vazia
}Fila;

int inicializa_fila(Fila *p, int c);
int fila_vazia(Fila f);
int fila_cheia(Fila f);
int inserir(Fila *p, int info);
int remover (Fila *p, int *info);
void mostra_fila(Fila p);
void desaloca_fila(Fila *p);








