from Baralho import *
from jogador import *
from Carta import *


flag = 'sim'
while flag == 'sim':
    baralho = Baralho()
    carta = Carta('x', 'y', 'z') #valores aleatorios apenas para a criação do objeto.
    
    baralho.embaralhar() #embaralhamento das cartas
    
    player1 = input("Digite o nome do jogador: ") #nome do jogador
    player2 = input("Digite o nome do jogador: ") #nome do jogador
    jogador1 = Jogador(player1)
    jogador2 = Jogador(player2)
 
    #Para testar o empate, comentar o add das cartas ao deck e inserir manualmente.
    for i in range(10): #deck de cartas do jogador 1 ----> 10 cartas
        jogador1.empilha(baralho.retirarCarta())

    for i in range(10): #deck de cartas do jogador 2 ----> 10 cartas
        jogador2.empilha(baralho.retirarCarta()) 
    
    rounds = 5
    rodada = 0
    for i in range(rounds):
        rodada += 1
        
        print()
        print('-----------')    
        print(f'{rodada}º rodada:')
        print()

        carta1 = jogador1.desempilha()
        carta2 = jogador2.desempilha()

        print(f'Carta de {jogador1.nome }: {carta1}')
        print(f'Carta de {jogador2.nome}: {carta2}')
        print()

        #Momento de Ver qual jogador foi o vencedor
     
        if carta.peso_carta(carta1) > carta.peso_carta(carta2):  #jogador 1 vence
            print(f"{jogador1.nome} Venceu!")
          
            jogador1.add_base(carta1) #Devolve a carta do jogador e adiciona a carta do rival ao seu deck
            jogador1.add_base(carta2)

        elif carta.peso_carta(carta2) > carta.peso_carta(carta1): #jogador 2 vence
            print(f"{jogador2.nome} Venceu!")
           
            jogador2.add_base(carta1) #Devolve a carta do jogador e adiciona a carta do rival ao seu deck
            jogador2.add_base(carta2)
       
        elif carta.peso_carta(carta1) == carta.peso_carta(carta2):  #Empate
            print("Empate!!")
            print('Rodada adicional')
            input("- pressione qualquer tecla para continuar -")            
            print()

            carta3 = jogador1.desempilha()
            carta4 = jogador2.desempilha()
            print(f'Nova carta de {jogador1.nome}: {carta3}')
            print(f'Nova carta de {jogador2.nome}: {carta4}')
                
            #somacx =  carta tirada inicialmente + a carta tirada após o empate
            somac1 = carta.peso_carta(carta1) + carta.peso_carta(carta3)
            somac2 = carta.peso_carta(carta2) + carta.peso_carta(carta4)
            if somac1 > somac2: # Jogador 1 Vence
                print()
                print(f"{jogador1.nome} Venceu!!")
                jogador1.add_base(carta1) #Devolve a carta do jogador e adiciona as cartas do rival ao seu deck
                jogador1.add_base(carta2)
                jogador1.add_base(carta3)
                jogador1.add_base(carta4)
            
            #Em caso de outro empate o jogador 2 vence
            elif  somac2 > somac1: #Jogador 2 Vence
                print()
                print(f"{jogador2.nome} Venceu!!")
                jogador2.add_base(carta1)   #Devolve a carta do jogador e adiciona as cartas do rival ao seu deck
                jogador2.add_base(carta2)
                jogador2.add_base(carta3)
                jogador2.add_base(carta4)
            else:
                print("Novo empate. As cartas foram devolvidas para seus respectivos decks.")
                jogador1.add_base(carta1)   #Em caso de novo empate, as cartas sao devolvidas para o b
                jogador1.add_base(carta3)
                jogador2.add_base(carta2)
                jogador2.add_base(carta4)
            
        print()
        print(f'Nº de Cartas de {jogador1.nome}: {jogador1.tamanho()}')
        print(f'Nº de Cartas do {jogador2.nome}: {jogador2.tamanho()}')
        print()
        #Confirmação para melhorar a visualização dos rounds
        x = input("- pressione qualquer tecla para o proximo round -") 
        print()
    #para reiniciar o jogo
    flag = input("Digite 'sim' para jogar novamente(qualquer tecla para encerrar): ")
print("Encerrando...")
