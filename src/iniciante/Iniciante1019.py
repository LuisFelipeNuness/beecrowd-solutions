valor = input()
valor = int(valor)

print('{:d}:{:d}:{:d}'.format(int(valor/3600), int((valor % 3600)/60), int(valor % 3600 % 60)))