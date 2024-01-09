A1, B1, C1 = input().split()

A2, B2, C2 = input().split()

print("VALOR A PAGAR: R$ {:.2f}".format(int(B1)*float(C1)+int(B2)*float(C2)))