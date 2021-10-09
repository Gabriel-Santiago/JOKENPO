from random import *


def choose_computer():
    computer = randint(0, 2)
    return computer

def choose_player():
    player = int(input('''
        Vamos jogar JOKENPÔ!
            0 - Pedra
            1 - Papel
            2 - Tesoura
            :'''))
    return player


def winner():
    list = ['Pedra', 'Papel', 'Tesoura']

    player_result = choose_player()
    computer_result = choose_computer()

    if computer_result == player_result:
        print(f'Player escolheu: {list[player_result]}')
        print(f'Computer escolher: {list[computer_result]}')
        print('Empate')
    elif (computer_result == 0 and player_result == 1) \
            or (computer_result == 1 and player_result == 2) \
            or (computer_result == 2 and player_result == 0):
        print(f'Player escolheu: {list[player_result]}')
        print(f'Computer escolher: {list[computer_result]}')
        print('Você Ganhou!')
    else:
        print(f'Player escolheu: {list[player_result]}')
        print(f'Computer escolher: {list[computer_result]}')
        print('Computer Ganhou')

def main():
    winner()

main()
