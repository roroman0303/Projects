import copy
#===============================

#def td_list(a, b):
    
#    l = [[0] * b for i in range(a)]
    #print(l)
#    return l
td_list = lambda a, b: [[0] * b for i in range(a)]

#===============================

def number_remover(sudoku):

    square = [0, 0] 
   
    for i in range(9):
        for j in range(9):
        
            if len(sudoku[i][j]) == 1:
            
                for ii in range(9):
                    if len(sudoku[ii][j]) != 1:
                        sudoku[ii][j] = sudoku[ii][j].replace(sudoku[i][j], "")
            
                for jj in range(9):
                    if len(sudoku[i][jj]) != 1:
                        sudoku[i][jj] = sudoku[i][jj].replace(sudoku[i][j], "")

                square[0] = (i // 3) * 3
                square[1] = (j // 3) * 3
                for iii in range(square[0], square[0] + 3):
                    for jjj in range(square[1], square[1] + 3):
                        if len(sudoku[iii][jjj]) != 1: sudoku[iii][jjj] = sudoku[iii][jjj].replace(sudoku[i][j], "")
    return sudoku

#===============================

def check(sudoku):
    
    square = [0, 0]
    for i in range(9):
            for j in range(9):
        
                if len(sudoku[i][j]) == 1:
            
                    for ii in range(9):
                        if len(sudoku[ii][j]) == 1:
                            if sudoku[ii][j] == sudoku[i][j] and ii != i: return False
            
                    for jj in range(9):
                        if len(sudoku[i][jj]) == 1:
                            if sudoku[i][jj] == sudoku[i][j] and jj != j: return False

                    square[0] = (i // 3) * 3
                    square[1] = (j // 3) * 3
                    for iii in range(square[0], square[0] + 3):
                        for jjj in range(square[1], square[1] + 3):
                            if len(sudoku[iii][jjj]) == 1:
                                if sudoku[iii][jjj] == sudoku[i][j] and jjj != j and iii != i: return False
                                
#===============================

def simple_solver(sudoku):
    
    cur_sudoku_sum = 0
    sudoku_sum = 0
    square = [0, 0]
            
    for i in range(9):
        for j in range(9): cur_sudoku_sum += int(sudoku[i][j])

    while (True):

        number_remover(sudoku)

        if check(sudoku) == False:
            return 0
        
        sudoku_sum = 0
        sudoku_len = 0
        for i in range(9):
            for j in range(9):
                sudoku_sum += int(sudoku[i][j])
                sudoku_len += len(sudoku[i][j])
    
        if cur_sudoku_sum != sudoku_sum: cur_sudoku_sum = sudoku_sum
        else:
            
            rnd_sudoku = copy.deepcopy(sudoku)
            rnd = [0, 0]
            for i in range(9):
                for j in range(9):  
                    if len(rnd_sudoku[i][j]) == 2:
                        rnd = [i, j]

            if rnd == [0, 0]: return sudoku
                                    
            rnd_sudoku[rnd[0]][rnd[1]] = rnd_sudoku[rnd[0]][rnd[1]].replace(rnd_sudoku[rnd[0]][rnd[1]][0], "")
            rnd_sudoku = simple_solver(rnd_sudoku)
            
            if rnd_sudoku == 0:
                rnd_sudoku = copy.deepcopy(sudoku)    
                rnd_sudoku[rnd[0]][rnd[1]] = rnd_sudoku[rnd[0]][rnd[1]].replace(rnd_sudoku[rnd[0]][rnd[1]][1], "")
                rnd_sudoku = simple_solver(rnd_sudoku)
                if rnd_sudoku == 0: return 0
            sudoku = copy.deepcopy(rnd_sudoku)   

#===============================

sudoku = td_list(9, 9)
sudoku[0] = ['0','8','0', '0','0','0', '0','9','0']
sudoku[1] = ['0','1','0', '0','8','6', '3','0','2']
sudoku[2] = ['0','0','0', '3','1','0', '0','0','0']

sudoku[3] = ['0','0','4', '0','0','0', '0','0','0']
sudoku[4] = ['0','0','0', '0','0','0', '0','0','5']
sudoku[5] = ['0','0','0', '2','6','1', '0','0','4']

sudoku[6] = ['0','0','0', '5','4','0', '0','0','6']
sudoku[7] = ['3','0','9', '0','0','0', '8','0','0']
sudoku[8] = ['2','0','0', '0','0','0', '0','0','0']

for i in range(9):
    for j in range(9):
        if len(sudoku[i][j]) > 1 or len(sudoku[i][j]) == 0: raise ValueError("Numbers must be one-digit!")
        sudoku[i][j] = sudoku[i][j].replace('0',"123456789")

sudoku = simple_solver(sudoku)


for i in range(9):
    print(sudoku[i])
#map(print, sudoku)
        

