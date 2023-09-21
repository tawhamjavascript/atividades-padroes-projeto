class Carta:

    def __init__(self, numero, naipe, cor):
        self.__numero = numero
        self.__naipe = naipe

    @property
    def naipe(self):
        return self.__naipe

    @property
    def numero(self):
        return self.__numero

    def peso_carta(self, _carta):
        #transformar o '_carta' em string e usando .split() para transfomar em uma list[], onde os valores sao separados pelo espaço em branco
        carta = str(_carta).split()
        #pegar o valor da primeira posição da list e retornar o valor em int
        if carta[0] == 'As':
            return 0
        elif carta[0] == '2':
            return 2
        elif carta[0] == '3':
            return 3
        elif carta[0] == '4':
            return 4
        elif carta[0] == '5':
            return 5
        elif carta[0] == '6':
            return 6
        elif carta[0] == '7':
            return 6
        elif carta[0] == '8':
            return 8
        elif carta[0] == '9':
            return 9
        elif carta[0] == '10':
            return 10
        elif carta[0] == 'valete':
            return 11
        elif carta[0] == 'dama':
            return 12
        elif carta[0] == 'rei':
            return 13
        else:
            return None

        

    def __str__(self): # todas as informacoes da carta
        return f'{self.__numero} de {self.__naipe}'


    