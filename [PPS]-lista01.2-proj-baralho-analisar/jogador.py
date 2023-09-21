from Baralho import *

class PilhaException(Exception):
    def __init__(self,mensagem,metodo=''):
        super().__init__(mensagem)
        self.metodo = metodo

class Node:
    def __init__(self, dado):
        self.dado = dado
        self.prox = None

    def insereProximo(self, dado):
        if (self.prox == None):
            self.prox = Node(dado)

    def getProximo(self):
        return self.prox

    def __str__(self):
        return str(self.data)

    def temProximo(self):
        return self.prox != None

#Originalmente o codigo de pilha encadeada disponibilizado pelo professor.
class Jogador:
    def __init__(self, nome):
        self.__head = None
        self.__tamanho = 0
        self.nome = nome
        

    def estaVazia(self):
        return self.__head == None

    def tamanho(self):
        return self.__tamanho

    def elemento(self, posicao):
        try:
            assert posicao > 0 and posicao <= self.__tamanho
 
            cursor = self.__head
            contador = 1
            while(cursor != None and contador < posicao ):
                contador += 1
                cursor = cursor.prox

            return cursor.dado
                
        except TypeError:
            raise PilhaException('Digite um número inteiro referente ao elemento desejado')
        except AssertionError:
            raise PilhaException(f'O elemento {posicao} NAO existe no deck de tamanho {self.__tamanho}')
        except:
            raise

    def busca(self, valor):
        cursor = self.__head
        contador = 1

        while( cursor != None):
            if cursor.dado == valor:
                return contador           
            cursor = cursor.prox
            contador += 1

        raise PilhaException(f'Valor {valor} nao esta no deck do jogador','busca()')
        

    def empilha(self, valor):
        novo = Node(valor)
        novo.prox = self.__head
        self.__head = novo
        self.__tamanho += 1
    
    def add_base(self, novo_dado):
            new_dado = Node(novo_dado)
            if self.__head == None:
                self.__head = new_dado
            else:
                no = self.__head
                while no.prox:
                    no = no.prox
                no.prox = new_dado
                self.__tamanho += 1

    def desempilha(self):
        if not self.estaVazia():
            dado = self.__head.dado
            self.__head = self.__head.prox
            self.__tamanho -= 1
            return dado
        raise PilhaException('O deck está vazio')
    
   

    def imprime(self):
        print(self.__str__())
        
    def __str__(self):
        cursor = self.__head
        primeiro = True
        s = 'topo->['
        while( cursor != None):
            if primeiro:
                s += f'{cursor.dado}'
                primeiro = False
            else:
                s += f', {cursor.dado}'
            cursor = cursor.prox

        s += ']'
        return s

 

# Programa para testar
if __name__ == '__main__':
    p = Jogador()
    p.empilha(10)
    p.empilha(20)
    p.empilha(30)
    p.empilha(40)
    p.add_base(1000)
    p.imprime()

    #esvaziando
