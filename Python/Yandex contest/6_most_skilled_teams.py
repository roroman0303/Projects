def maxProfit(players):
    # для того чтобы эффективно распределить в разные команды
    # нужно найти разницу в скилле каждого
    # и затем рассортировать в команды по убыванию этой разницы
    difference_players = [[abs(player[0]-player[1]), player[0], player[1]] for player in players]
    difference_players = sorted(difference_players, reverse=True)
    team_1 = 0
    team_2 = 0
    profit = 0
    for i in range(len(difference_players)):
        if difference_players[i][1] > difference_players[i][2]:
            team_1 += 1
            profit += difference_players[i][1]
        else:
            team_2 += 1
            profit += difference_players[i][2]
        # если одна из команд уже набрала половину из всех людей
        # всех остальных распределяем в другую команду
        if team_1 == len(difference_players)//2:
            profit += sum([player[2] for player in difference_players[i+1:]])
            break
        if team_2 == len(difference_players)//2:
            profit += sum([player[1] for player in difference_players[i+1:]])
            break
    return profit


n = int(input())
a = [int(i) for i in input().split()]
b = [int(i) for i in input().split()]

players = [[a[i], b[i]] for i in range(n)]

m = int(input())
for i in range(m):
    s = [int(i) for i in input().split()]
    id = s[0] - 1  # игроки нумеруются с 0
    skill = s[1] - 1  # навыки нумеруются с 0
    value = s[2]
    players[id][skill] += value
    print(maxProfit(players))


