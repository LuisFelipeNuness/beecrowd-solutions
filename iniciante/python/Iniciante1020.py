valor = input()
valor = int(valor)

print('{:d} ano(s)'.format(int(valor/365)))
print('{:d} mes(es)'.format(int(valor % 365 / 30)))
print('{:d} dia(s)'.format(int(valor % 365 % 30)))