X, Y, Z = input().split(" ")

itens = [int(X), int(Y), int(Z)]

for i in range(3):
	for i in range(2):
		if(itens[i]>itens[i+1]):
			aux = itens[i]
			itens[i] = itens[i+1]
			itens[i+1] = aux
			
print(itens[0])
print(itens[1])
print(itens[2])
print("")
print(X)
print(Y)
print(Z)
