def canWePlay(nodes):
    first_team = set()  # первая команда
    second_team = set()  # вторая команда
    all = {i for i in range(1, len(nodes) + 1)}  # все узлы
    visited = set()  # просмотренные узлы
    first_team.add(1)  # начинаем с первого узла

    while len(first_team)+len(second_team) < len(all):
        tmp_first = first_team.copy()  # проверка изменится ли что-нибудь
        tmp_second = second_team.copy()
        # смотрим от противного - все коллеги, с которыми не дружит
        # рассматриваемый работник, окажутся в противоположной команде
        for node in first_team:
            if node not in visited:
                not_in_first = all - set(nodes[node])  # с ними не играем
                not_in_first.discard(node)
                second_team = second_team.union(not_in_first)
                visited.add(node)
        for node in second_team:
            if node not in visited:
                not_in_second = all - set(nodes[node])  # с ними не играем
                not_in_second.discard(node)
                first_team = first_team.union(not_in_second)
                visited.add(node)
        # если ничего не изменилось, берем новый узел
        if tmp_first == first_team and tmp_second == second_team:
            for i in range(1, len(nodes)):
                if i not in first_team and i not in second_team:
                    first_team.add(i)
    # если в командах есть повторяющиеся игроки, значит распределить нельзя
    if len(first_team & second_team) > 0: return -1
    else: return [first_team, second_team]


n, m = (int(i) for i in input().split())  # n - вершины, m - ребра
nodes = {i: [] for i in range(1, n+1)}  # {вершина: связи}

for i in range(m):
    a = [int(k) for k in input().split()]
    nodes[a[0]].append(a[1])
    nodes[a[1]].append(a[0])

result = canWePlay(nodes)
if result == -1: print(-1)
else:
    print(str(len(result[0])))
    print(" ".join(map(str, result[0])))
    print(" ".join(map(str, result[1])))

